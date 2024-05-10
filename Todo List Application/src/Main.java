import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input =new Scanner(System.in);

    private static ArrayList<Task> tasks=new ArrayList<>();

    public static void main(String[] args) {

        menu();

        System.out.print("Enter Your choice:");
        int choice=input.nextInt();

        switch (choice){
            case 1:
                System.out.println("You can add new Tasks!");
                addTask();

        }

    }

    public static void menuLine() {
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
    }

    public static void menu() {

        menuLine();
        System.out.println("\n|\t\t\tTO DO APPLICATION\t\t\t|");
        menuLine();

        System.out.println("\n\t1.Add Task\n\t2.Edit Task\n\t3.Delete Task\n\t4.Mark Task as Complete" +
                "\n\t5.Task List");

        menuLine();
    }

    public static void addTask(){
        System.out.print("Enter task Description:");
        String task=input.next();

        System.out.print("Enter due date:");
        String date=input.next();

        Task newTask=new Task(task,date);
        tasks.add(newTask);

        System.out.println("Task added Successfully!");

    }
}