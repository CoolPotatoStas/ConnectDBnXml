package databaseadapter.service;

import databaseadapter.entity.Faculty;
import databaseadapter.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

    @Autowired
    FacultyRepository repository;

    public void addFaculty(Faculty faculty){
        repository.save(faculty);
    }
}
