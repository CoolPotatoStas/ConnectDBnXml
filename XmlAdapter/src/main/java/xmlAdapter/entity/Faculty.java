package xmlAdapter.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;

@XmlRootElement(name = "faculty")
@XmlAccessorType(XmlAccessType.FIELD)
public class Faculty {

    @XmlElement(name = "title")
    String title;
    @XmlElementWrapper(name = "program-eng")
    @XmlElement(name = "group")
    ArrayList<Group> progEng;
    @XmlElementWrapper(name = "cyber-sec")
    @XmlElement(name = "group")
    ArrayList<Group> cyberSec;
    @XmlElementWrapper(name = "math-sec")
    @XmlElement(name = "group")
    ArrayList<Group> mathSec;

    public Faculty(String title, ArrayList<Group> progEng, ArrayList<Group> cyberSec, ArrayList<Group> mathSec) {
        this.title = title;
        this.progEng = progEng;
        this.cyberSec = cyberSec;
        this.mathSec = mathSec;
    }

    public Faculty() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Group> getProgEng() {
        return progEng;
    }

    public void setProgEng(ArrayList<Group> progEng) {
        this.progEng = progEng;
    }

    public ArrayList<Group> getCyberSec() {
        return cyberSec;
    }

    public void setCyberSec(ArrayList<Group> cyberSec) {
        this.cyberSec = cyberSec;
    }

    public ArrayList<Group> getMathSec() {
        return mathSec;
    }

    public void setMathSec(ArrayList<Group> mathSec) {
        this.mathSec = mathSec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return title.equals(faculty.title) && progEng.equals(faculty.progEng) && cyberSec.equals(faculty.cyberSec) && mathSec.equals(faculty.mathSec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, progEng, cyberSec, mathSec);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "title='" + title + '\'' +
                ", progEng=" + progEng +
                ", cyberSec=" + cyberSec +
                ", mathSec=" + mathSec +
                '}';
    }
}
