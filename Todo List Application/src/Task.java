public class Task {
    private String description;
    private String dueDate;

    public Task(String description,String dueDate){
        this.description=description;
        this.dueDate=dueDate;
    }

    public String getDescription(){
        return description;
    }
    public String getDueDate(){
        return dueDate;
    }
}
