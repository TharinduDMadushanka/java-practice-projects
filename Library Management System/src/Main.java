import java.util.Scanner;

public class Main {
    static Scanner input =new Scanner(System.in);
    static DataBase database;

    public static void main(String[] args) {

        database = new DataBase();
        System.out.println("Welcome to Library Management System!");

        int num;

        do {
            System.out.println("\t0. Exit\n\t1. Login\n\t2. New User");
            System.out.print("Enter your option:");
            num=input.nextInt();

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

    private static void login(){
        System.out.print("Enter phone number: ");
        String phoneNumber= input.next();
        System.out.print("Enter email: ");
        String email=input.next();
        int n = database.login(phoneNumber, email);
        if (n != -1){
            User user =database.getUser(n);
            user.menu();
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