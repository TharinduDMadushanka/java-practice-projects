package school_management_system;

/**
 * This class is responsible for keeping track
 * of teacher;s name,id & salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * create a new Teacher object
     * @param id --> id for the teacher.
     * @param name --> name of the teacher
     * @param salary --> salary of the salary
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id,name & salary of the current teacher
     */
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receiveSalary(int salary){// adds to salaryEarned & removes the total money earned by the school
        salaryEarned-=salary;
        School.updateTotalMoneySpent(salary);
    }
}
