import java.util.Scanner;

public class Admin extends User{

    static String [] books= {"Harry Potter","The Hunger Games","The Lord of the Rings","Pride and Prejudice","Don Quixote","A Tale of Two Cities",
            "The Book Thief","A Tale of Two Cities"};

    static Scanner admin = new Scanner(System.in);

    public Admin(String name){
        super(name);
    }

    public Admin(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
    }

    public Admin() {

    }

    @Override
    public void menu(){
        System.out.println("1. View Books");
        System.out.println("2. Add Books");
        System.out.println("3. Delete Books");
        System.out.println("4. Search");
        System.out.println("5. Exit");
    }
    public static void viewBook(){

        for (String book : books) {
            System.out.println("\t~" + book);
        }
    }

    public void addBook(){
        System.out.print("Enter book name for add :");
        String addName=admin.next();

        // Create a new array with a size one greater than the original array
        String[] newBooks = new String[books.length+1];
        for (int i=0;i<books.length;i++){
            newBooks[i]=books[i];
        }

        // Add the new book to the end of the new array
        newBooks[books.length] = addName;

        // Output the updated array of books
        System.out.println("Updated array of books:");
        for (String book : newBooks) {
            System.out.println("\t~"+book);
        }
    }

    public static void deleteBook(){
        System.out.print("Enter the name of the book for remove.");
        String bookToDelete=admin.next();
        String[] arr=new String[5];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(bookToDelete)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String[] newArr = new String[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }
        } else {
            System.out.println("Book not found in the list.");
        }
    }
}
