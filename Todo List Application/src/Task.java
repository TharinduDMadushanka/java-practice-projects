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

    public void setDescription(String description){
        this.description=description;
    }

    public void setDueDate(String dueDate){
        this.dueDate=dueDate;
    }
}
