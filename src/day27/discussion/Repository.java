package day27.discussion;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"testName1",24,"CS","2nd"));
        students.add(new Student(2,"testName2",25,"IT","2nd"));

        return students;
    }

    public Student searchStudent () {
        Student stud = new Student(1, "Jerry Matubis", 12, "BSIT", "5th");
        Student stud1 = new Student(2, "Lester Osana", 19, "BSCPE", "4th");

        return stud1;
    }
}
