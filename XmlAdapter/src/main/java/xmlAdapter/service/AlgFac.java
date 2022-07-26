package xmlAdapter.service;

import xmlAdapter.entity.Faculty;
import xmlAdapter.entity.Group;
import xmlAdapter.entity.Student;
import xmlAdapter.repository.Algorithm;

public final class AlgFac implements Algorithm {

    private void printGroup(Group g){
        System.out.println("\t" + g.getTitle());
        System.out.println("\t" + g.getCourse().getTitle());
        for (Student s: g.getStudents()){
            System.out.println("\t\t" + s.getSurname());
        }
        System.out.println();
    }

    @Override
    public void printAll(Faculty faculty) {

        System.out.println("Факультет: " + faculty.getTitle());

        if (faculty.getProgEng() != null){
            System.out.println(faculty.getProgEng().get(0).getDirection().getTitle());
            System.out.println(faculty.getProgEng().get(0).getDirection().getDescription());
            for (Group g: faculty.getProgEng()){
                printGroup(g);
            }
            System.out.println();
        }

        if (faculty.getCyberSec() != null){
            System.out.println(faculty.getCyberSec().get(0).getDirection());
            for (Group g: faculty.getCyberSec()){
                printGroup(g);
            }
            System.out.println();
        }

        if (faculty.getMathSec() != null){
            System.out.println(faculty.getMathSec().get(0).getDirection());
            for (Group g: faculty.getCyberSec()){
                printGroup(g);
            }
            System.out.println();
        }
    }
}
