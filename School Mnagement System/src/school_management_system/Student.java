package school_management_system;

/*
 * This class is responsible for keeping the
 * track of student fees,name,grade & fees
 * paid
 * */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initializing.
     * Fees for every student if $ 30,000
     * fees paid initially is 0.
     *
     * @param id    --> id for the student: unique
     * @param name  --> name of the student
     * @param grade --> grade of the student
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter student's name & id.

    /**
     * Use to upgrade the student's grade
     *
     * @param grade--> grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to feesPaid field
     * add the fees to the fees paid
     * The school is going to receive the funds.
     *
     * @param fees --> the fees that the student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * Getters
     *
     * @return id, name & grade of student
     * return fees paid by the student
     * return the total fees of the student
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){//return remain fees
        return feesTotal-feesPaid;
    }

}
