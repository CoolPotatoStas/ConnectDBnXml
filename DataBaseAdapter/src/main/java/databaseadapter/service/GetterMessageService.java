package databaseadapter.service;

import databaseadapter.entity.Faculty;
import databaseadapter.entityXml.FacultyXml;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetterMessageService {

    @Autowired
    TransformerXmlObjToEntityService transformer;

    @Autowired
    FacultyService facultyService;

    @RabbitListener(queues = "JSONMessage")
    public void getMessageFromQueue(FacultyXml facultyXml){

        Faculty faculty = transformer.parseFacultyXml(facultyXml);
        facultyService.addFaculty(faculty);
    }
}
