package xmlAdapter.service;

import org.springframework.stereotype.Service;
import xmlAdapter.entity.Faculty;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class TransformerXml {

    public Faculty parseXmlToObjects(File file)
            throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Faculty.class);
        return (Faculty) context.createUnmarshaller().unmarshal(new FileReader(file));
    }
}
