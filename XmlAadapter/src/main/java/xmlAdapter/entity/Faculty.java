package xmlAdapter.entity;

import java.util.List;
import java.util.Objects;

public class Faculty {

    String title;
    List<Group> progEng;
    List<Group> cyberSec;
    List<Group> mathSec;


    public Faculty(String title, List<Group> progEng, List<Group> cyberSec, List<Group> mathSec) {
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

    public List<Group> getProgEng() {
        return progEng;
    }

    public void setProgEng(List<Group> progEng) {
        this.progEng = progEng;
    }

    public List<Group> getCyberSec() {
        return cyberSec;
    }

    public void setCyberSec(List<Group> cyberSec) {
        this.cyberSec = cyberSec;
    }

    public List<Group> getMathSec() {
        return mathSec;
    }

    public void setMathSec(List<Group> mathSec) {
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
