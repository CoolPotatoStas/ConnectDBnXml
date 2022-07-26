package xmlAdapter.entity;

import xmlAdapter.dictionary.*;

import java.util.List;
import java.util.Objects;

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

    public Group() {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return title.equals(group.title) && direction == group.direction && course == group.course && students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, direction, course, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", direction=" + direction +
                ", course=" + course +
                ", students=" + students +
                '}';
    }
}
