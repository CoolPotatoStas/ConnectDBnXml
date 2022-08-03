package databaseadapter.entityXml;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;

@XmlRootElement(name = "faculty")
@XmlAccessorType(XmlAccessType.FIELD)
public class FacultyXml {

    @XmlElement(name = "title")
    String title;
    @XmlElementWrapper(name = "program-eng")
    @XmlElement(name = "group")
    ArrayList<GroupXml> progEng;
    @XmlElementWrapper(name = "cyber-sec")
    @XmlElement(name = "group")
    ArrayList<GroupXml> cyberSec;
    @XmlElementWrapper(name = "math-sec")
    @XmlElement(name = "group")
    ArrayList<GroupXml> mathSec;

    public FacultyXml(String title, ArrayList<GroupXml> progEng, ArrayList<GroupXml> cyberSec, ArrayList<GroupXml> mathSec) {
        this.title = title;
        this.progEng = progEng;
        this.cyberSec = cyberSec;
        this.mathSec = mathSec;
    }

    public FacultyXml() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<GroupXml> getProgEng() {
        return progEng;
    }

    public void setProgEng(ArrayList<GroupXml> progEng) {
        this.progEng = progEng;
    }

    public ArrayList<GroupXml> getCyberSec() {
        return cyberSec;
    }

    public void setCyberSec(ArrayList<GroupXml> cyberSec) {
        this.cyberSec = cyberSec;
    }

    public ArrayList<GroupXml> getMathSec() {
        return mathSec;
    }

    public void setMathSec(ArrayList<GroupXml> mathSec) {
        this.mathSec = mathSec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultyXml faculty = (FacultyXml) o;
        return title.equals(faculty.title) && progEng.equals(faculty.progEng) && cyberSec.equals(faculty.cyberSec) && mathSec.equals(faculty.mathSec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, progEng, cyberSec, mathSec);
    }

    @Override
    public String toString() {
        return "FacultyXml{" +
                "title='" + title + '\'' +
                ", progEng=" + progEng +
                ", cyberSec=" + cyberSec +
                ", mathSec=" + mathSec +
                '}';
    }
}
