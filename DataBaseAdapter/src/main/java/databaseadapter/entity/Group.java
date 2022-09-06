package databaseadapter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Group {

    @Id
    long id;

    Direction direction;

    Course course;

    List<Student> students;
}
