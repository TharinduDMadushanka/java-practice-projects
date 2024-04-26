package school_management_system;

/**
 * This class is responsible for keeping track
 * of teacher;s name,id & salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;

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
}
