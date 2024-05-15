import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Test_GUI {

    static Scanner input =new Scanner(System.in);
    static int taskCount = 0;
    static Task[][] tasks = new Task[taskCount + 1][2];
    static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("To-Do Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // You may replace this with a proper layout manager

        JButton addButton = new JButton("Add Task");
        addButton.setBounds(50, 50, 100, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });
        frame.add(addButton);

        JButton editButton = new JButton("Edit Task");
        editButton.setBounds(50, 100, 100, 30);
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editTask();
            }
        });
        frame.add(editButton);

        JButton deleteButton = new JButton("Delete Task");
        deleteButton.setBounds(50, 150, 100, 30);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });
        frame.add(deleteButton);

        JButton showButton = new JButton("Show Tasks");
        showButton.setBounds(50, 200, 100, 30);
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showTasks();
            }
        });
        frame.add(showButton);

        frame.setVisible(true);
    }

    public static void addTask() {
        // Implement your addTask logic here
        // You may use JOptionPane for input dialogs
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
        // Implement your editTask logic here
        // You may use JOptionPane for input dialogs
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

    public static void deleteTask() {
        // Implement your deleteTask logic here
        // You may use JOptionPane for input dialogs
        char choice;

        do {

            System.out.print("Enter task number for delete: ");
            int taskNumber = input.nextInt();

            if (taskNumber < 0 || taskNumber > taskCount) {
                System.out.println("Invalid task number!");
                return;
            }

            int index = taskNumber - 2;

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
        // Implement your showTasks logic here
        // You may use JOptionPane for displaying tasks
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

    }
}
