package xmlAdapter.entity;

import xmlAdapter.dictionary.*;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;

@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {
    @XmlElement(name = "name")
    String name;
    @XmlElement(name = "direction")
    Direction direction;
    @XmlElement(name = "course")
    Course course;
    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    ArrayList<Student> students;

    public Group(String title, Direction direction, Course course, ArrayList<Student> students) {
        this.name = title;
        this.direction = direction;
        this.course = course;
        this.students = students;
    }

    public Group() {
    }

    public String getTitle() {
        return name;
    }

    public Direction getDirection() {
        return direction;
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return name.equals(group.name) && direction == group.direction && course == group.course && students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, course, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + name + '\'' +
                ", direction=" + direction +
                ", course=" + course +
                ", students=" + students +
                '}';
    }
}
