package school_management_system;

import java.util.List;

/**
 * Many teachers, many students
 * Implement teachers and students using ArrayLists
 */
public class School {
    private List<Teacher> teachers; // List of teachers (unknown numbers)
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     *
     * @param teachers--> list of teachers in the school
     * @param students    --> list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {// returns the list of teachers in the school
        return teachers;
    }

    public void addTeachers(Teacher teacher) { //add teachers to the school
        teachers.add(teacher);
    }

    public List<Student> getStudents() {// returns the list of students in the school
        return students;
    }

    public void addStudents(Student student) {// add student to the school
        students.add(student);
    }

    public int getTotalMoneyEarned() { // return the total money earned by school
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) { // add the total money earned by school
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {// return the total money spent by school
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {// update  money that is spent by school (salary of scl teachers)
        totalMoneyEarned -= MoneySpent;
    }
}
