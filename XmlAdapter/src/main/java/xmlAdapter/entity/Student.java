package xmlAdapter.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @XmlElement(name = "name")
    String name;
    @XmlElement(name = "second-name")
    String secondName;
    @XmlElement(name = "surname")
    String surname;
    @XmlElement(name = "age")
    double age;
    @XmlElementWrapper(name = "hobbies")
    @XmlElement(name = "hobby")
    ArrayList<Hobby> hobbies;

    public Student(String name, String secondName, String surname, double age, ArrayList<Hobby> hobbies) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.age, age) == 0 && name.equals(student.name) && secondName.equals(student.secondName) && surname.equals(student.surname) && hobbies.equals(student.hobbies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, surname, age, hobbies);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
