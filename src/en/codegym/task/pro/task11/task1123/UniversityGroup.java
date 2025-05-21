package en.codegym.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Feel like a university dean
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Stephan Fontaine");
        students.add("Victor Brown");
        students.add("Max Abelman");
        students.add("Nadine Nkosi");
        students.add("Aimee Blanchet");
        students.add("Nick Burns");
        students.add("Chika Tanaka");
    }

    public void exclude(String excludedStudent) {
        for (String student : students) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Victor Brown");
        universityGroup.students.forEach(System.out::println);
    }
}