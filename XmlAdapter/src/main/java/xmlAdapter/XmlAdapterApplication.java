package xmlAdapter;

import xmlAdapter.dictionary.Course;
import xmlAdapter.dictionary.Direction;
import xmlAdapter.entity.*;
import xmlAdapter.service.AlgFac;

import java.util.ArrayList;

//public class XmlAdapterApplication {
//
//    private static Faculty initialize(){
//
//        Faculty faculty = new Faculty();
//        faculty.setTitle("ИиВТ");
//        Group group = new Group();
//        group.setTitle("ВПР32");
//        group.setCourse(Course.THIRD);
//        group.setDirection(Direction.ProgramEng);
//        ArrayList<Student> a1 = new ArrayList<>();
//        Student st1 = new Student();
//        st1.setSurname("Губарева");
//        a1.add(st1);
//        group.setStudents(a1);
//        ArrayList<Group> a2 = new ArrayList<>();
//        a2.add(group);
//        faculty.setProgEng(a2);
//
//        return faculty;
//    }
//
//    public static void main(String[] args) {
//
//        Faculty fac = initialize();
//
//        AlgFac af = new AlgFac();
//        af.printAll(fac);
//    }
//
//}
