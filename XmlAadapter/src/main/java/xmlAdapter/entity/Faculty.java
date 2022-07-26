package xmlAdapter.entity;

import java.util.List;

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
}
