package xmlAdapter.entity;

import xmlAdapter.dictionary.*;

import java.util.List;

public class Group {
    String title;
    Direction direction;
    Course course;
    List<Student> students;

    public Group(String title, Direction direction, Course course, List<Student> students) {
        this.title = title;
        this.direction = direction;
        this.course = course;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public Direction getDirection() {
        return direction;
    }

    public Course getCourse() {
        return course;
    }

    public List<Student> getStudents() {
        return students;
    }
}
