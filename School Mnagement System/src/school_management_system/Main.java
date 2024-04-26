package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1, "Lizzy", 500);
        Teacher Melissa = new Teacher(2, "Melissa", 700);
        Teacher Jhon = new Teacher(3, "Jhon", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(Jhon);

        Student tamasha = new Student(1, "tamasha", 4);
        Student Tharindu = new Student(2, "Tharindu", 10);
        Student rooby = new Student(3, "Rooby", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(Tharindu);
        studentList.add(rooby);

        School ghs = new School(teacherList, studentList);

        tamasha.payFees(5000);
        System.out.println("GHS has earned: $ " + ghs.getTotalMoneyEarned());
    }
}
