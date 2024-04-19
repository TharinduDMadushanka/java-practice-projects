import java.util.Scanner;

public class Main {
    static Scanner input =new Scanner(System.in); //Scanner class for get user inputs for all in main class
    static DataBase database; // Create database object for Main class

    public static void main(String[] args) {

        database = new DataBase(); // Create database object for Main class
        System.out.println("Welcome to Library Management System!");

        int num;

        do {
            System.out.println("\t0. Exit\n\t1. Login\n\t2. New User"); // Create user menu
            System.out.print("Enter your option:");
            num=input.nextInt(); // Save user menu input

            switch (num){
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
            }
        }while (num!=0);

    }

    private static void login(){ // Login method for case:1
        System.out.print("Enter phone number: ");
        String phoneNumber= input.next();
        System.out.print("Enter email: ");
        String email=input.next();
        int n = database.login(phoneNumber, email); //Calls the login method from the DataBase object to verify the user's login credentials.
        if (n != -1){
            User user =database.getUser(n);
            user.menu();                                /* 1. The method iterates through the list of users in the users list.
                                                           2. For each user, it checks whether the user's phone number and email match the provided phone number and email.
                                                           3. If a matching user is found, the method returns the index (position) of that user in the users list.
                                                           4.If a matching user is found, the method returns the index of the user in the users list.
                                                           5.If no matching user is found, the method returns -1 to indicate that the user does not exist.*/
        }else{
            System.out.println("User doesn't exist!");
        }
    }


    private static void newUser(){
        System.out.print("Enter Name:");
        String name = input.next();
        System.out.print("Enter phone number:");
        String phoneNumber=input.next();
        System.out.print("Enter email:");
        String email=input.next();

        System.out.println("\t1. Admin\n\t2. Normal User");
        int userChoice2=input.nextInt();
        User user;
        if (userChoice2==1){
            user =new User(name, email, phoneNumber);
        }else {
            user =new NormalUser(name, email, phoneNumber);
        }
        database.AddUser(user);
        user.menu();
    }
}
/*User Creation:
Based on the user's choice (admin or normal user), the method creates a new instance of either Admin or NormalUser.
The new user instance is initialized with the provided name, phone number, and email.
Adding User to Database:
The new user instance is added to the database using the AddUser method of the DataBase class.
User Menu:
After adding the user to the database, the method displays the menu for the newly created user by calling the menu() method on the user object.*/