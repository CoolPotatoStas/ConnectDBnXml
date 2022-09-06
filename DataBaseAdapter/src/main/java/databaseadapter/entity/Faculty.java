package databaseadapter.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Faculty {

    @Id
    long id;

    @Column(name = "title")
    String title;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_faculty")
    List<Group> progEng;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_faculty")
    List<Group> cyberSec;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_faculty")
    List<Group> mathSec;
}
