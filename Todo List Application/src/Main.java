import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    //private static ArrayList<Task> tasks = new ArrayList<>();
    static int taskCount = 0;
    static int date;
    static Task[][] tasks = new Task[taskCount + 1][2];

    public static void main(String[] args) {

        int choice;
        do {
            menu();

            System.out.print("\npress(-1) to quit. Enter Your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("YOU CAN ADD NEW TASKS!");
                    addTask();
                    break;

                case 2:
                    System.out.println("YOU CAN UPDATE TASKS!");
                    editTask();
                    break;

                case 3:
                    System.out.println("YOU CAN DELETE TASKS!");
                    deleteTask();
                    break;

                case 5:
                    System.out.println("\t~ TASK LIST ~");
                    showTasks();
                    break;

                default:
                    System.out.println("Invalid input.");

            }
        } while (choice != -1);
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

    public static void addTask() {

        char choice;

        do {

            System.out.print("Enter task Description:");
            String task = input.next();

            System.out.print("Enter due date:");
            String date = input.next();

            Task newTask = new Task(task, date);
            tasks[taskCount][0] = newTask;
            taskCount++;

            System.out.println("Task added Successfully!");

            System.out.print("Do you want add another task (y/n):");
            choice = input.next().toLowerCase().charAt(0);
            extendArray();
        } while (choice == 'y');

    }

    public static void editTask() {

        char choice;

        do {

            System.out.print("Enter the task number for edit:");
            int taskNumber = input.nextInt();

            if (taskNumber < 0 || taskNumber > taskCount) {
                System.out.println("Invalid task number!");
                return;
            }

            int index = taskNumber - 1;

            System.out.print("Enter new task Description: ");
            String newTask = input.next();

            System.out.print("Enter new Due date:");
            String newDate = input.next();

            tasks[index][0].setDescription(newTask);
            tasks[index][0].setDueDate(newDate);

            System.out.println("Task Updated Successfully.");

            System.out.print("Do you want add another task (y/n):");
            choice = input.next().toLowerCase().charAt(0);
        } while (choice == 'y');
    }

    public static void deleteTask(){

        char choice;

        do {

            System.out.print("Enter task number for delete: ");
            int taskNumber = input.nextInt();

            if (taskNumber < 0 || taskNumber > taskCount) {
                System.out.println("Invalid task number!");
                return;
            }

            int index = taskNumber - 1;

            for (int i = index; i < taskCount - 1; i++) {
                tasks[i][0] = tasks[i + 1][0];
            }

            taskCount--;

            System.out.println("Task deleted successfully.");
            System.out.print("Do you want delete another task (y/n) :");
            choice=input.next().toLowerCase().charAt(0);

        }while (choice == 'y');
    }

    public static void showTasks() {
        for (int i = 0; i < taskCount; i++) {
            System.out.println("~ Task " + (i + 1) + " ~");
            System.out.println("\t-Description : " + tasks[i][0].getDescription());
            System.out.println("\t-Due date : " + tasks[i][0].getDueDate());
        }

        System.out.println("There are "+taskCount+" tasks to do!");
    }

    private static void extendArray() {
        // Create a new temporary array with double the size of the original array
        Task[][] temp = new Task[tasks.length * 2][2];

        // Copy the contents of the original array into the temporary array
        System.arraycopy(tasks, 0, temp, 0, tasks.length);

        // Update the tasks array reference to point to the new extended array
        tasks = temp;

        System.out.println("Array extended successfully!");
    }
}