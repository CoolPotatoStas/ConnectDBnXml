package xmlAdapter.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class SenderToDB {

    @Autowired
    TransformerXml transformer;
    @Autowired
    RabbitTemplate rabbitTemplate;

    public boolean sendMessage(File f){

        try{
            rabbitTemplate.convertAndSend("", transformer.parseXmlToObjects(f));
            return true;
        } catch (Exception e){

        }
        return false;
    }
}
