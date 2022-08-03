package xmlAdapter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;
import org.springframework.integration.file.filters.CompositeFileListFilter;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;
import org.springframework.integration.file.support.FileExistsMode;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import xmlAdapter.service.SenderToDB;

import java.io.File;

@Configuration
@EnableIntegration
public class IntegrationConfig {
    @Value("${integconfig.input_dir}")
    public String INPUT_DIR;
    @Value("${integconfig.output_dir}")
    public String OUTPUT_DIR;
    @Value("${integconfig.error_dir}")
    public String ERROR_DIR;
    public String FILE_PATTERN = "*.xml";

    @Autowired
    SenderToDB sender;

    @Bean
    public MessageChannel inputChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel outputChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel errorChannel() {
        return new DirectChannel();
    }

    @Bean
    @InboundChannelAdapter(value = "inputChannel", poller = @Poller(fixedDelay = "2000"))
    public MessageSource<File> fileReadingMessageSource() { //

        CompositeFileListFilter<File> filters = new CompositeFileListFilter<>();
        filters.addFilter(new SimplePatternFileListFilter(FILE_PATTERN));
        FileReadingMessageSource source = new FileReadingMessageSource();
        source.setDirectory(new File(INPUT_DIR));
        source.setFilter(filters);
        return source;
    }

    @Bean
    public IntegrationFlow routerFlow2() {
        return IntegrationFlows.from("inputChannel")
                .route(File.class, m -> sender.sendMessage(m),
                        m -> m
                                .channelMapping(true, "outputChannel")
                                .channelMapping(false, "errorChannel"))
                .get();
    }

    @Bean
    @ServiceActivator(inputChannel = "outputChannel")
    public MessageHandler fileWritingMessageHandler() { //
        FileWritingMessageHandler handler = new FileWritingMessageHandler(new File(OUTPUT_DIR));
        handler.setFileExistsMode(FileExistsMode.REPLACE);
        handler.setExpectReply(false);
        handler.setDeleteSourceFiles(true);

        return handler;
    }

    @Bean
    @ServiceActivator(inputChannel = "errorChannel")
    public MessageHandler fileWritingErrorHandler() {
        FileWritingMessageHandler handler = new FileWritingMessageHandler(new File(ERROR_DIR));
        handler.setFileExistsMode(FileExistsMode.REPLACE);
        handler.setExpectReply(false);
        handler.setDeleteSourceFiles(true);

        return handler;
    }
}
