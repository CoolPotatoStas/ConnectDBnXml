package xmlAdapter.service;

import xmlAdapter.entity.Group;
import xmlAdapter.entity.Student;
import xmlAdapter.repository.Algorithm;

public class TrashAlgImpl implements Algorithm {

    public static void addStudent(Group group, Student student){
        group.getStudents().add(student);
    }

    public static void deleteStudent(Group group, Student student){
        group.getStudents().remove(student);
    }
}
