public class Main {
    public static void main(String[] args) {

        menu();
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
}