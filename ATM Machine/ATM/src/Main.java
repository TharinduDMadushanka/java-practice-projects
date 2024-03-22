import java.util.Scanner;

public class Main {

    private static double userBalance=0;
    private static double withdrawMoney=0;
    private static double depoMoney=0;

    public static void main(String[] args) {
        final int AtmNumber = 123;
        final int PinNumber = 123;
        boolean exitProgram= false;
        Scanner input = new Scanner(System.in);

        while (!exitProgram) {
            System.out.print("Enter ATM number: ");
            int atmNb = input.nextInt();

            if (atmNb == AtmNumber) {
                System.out.print("Enter PIN number:");
                int pinNb = input.nextInt();

                if (pinNb == PinNumber) {
                    displayMenu();

                    System.out.println("Enter your option.");
                    int userInput =input.nextInt();

                    switch (userInput){
                        case 1:
                            availableBalance();
                            break;
                        case 2:
                            withdrawAmount(input);
                            break;
                        case 3:
                            depositAmount(input);
                            break;
                        case 4:
                            viewStatement();
                            break;
                        case 5:
                            System.out.println("Thanks You!");
                            if(userInput==5){
                                exitProgram=true;
                            }

                    }

                } else {
                    System.out.println("Invalid PIN Number.");
                }
            } else {
                System.out.println("Invalid ATM Number.");
            }
        }
    }
    public static void displayMenu(){
        System.out.println("Welcome to ATM Banking!");
        System.out.println("1.Check Available Balance.");
        System.out.println("2.Withdraw Amount.");
        System.out.println("3.Deposit Amount.");
        System.out.println("4.View Mini Statement.");
        System.out.println("5.Exit");
    }
    public static void availableBalance(){
        double Balance = 0;
        System.out.println("Your available balance is: "+ Balance);

    }
    public static void withdrawAmount(Scanner input){
        System.out.println("Enter Amount for withdraw.");
        double withdraw = input.nextDouble();
        if (userBalance<withdraw){
            System.out.println("Sorry! your account balance is low.");
        }else {
            System.out.println("You successfully withdraw "+withdraw+" $.");
            userBalance -= withdraw;
        }
        withdrawMoney=withdraw;

    }
    public static void depositAmount(Scanner input){
        System.out.println("Enter Amount for Deposit.");
        double deposit = input.nextDouble();
        System.out.println("You successfully Deposit "+deposit+" $.");
        userBalance+=deposit;
        depoMoney=deposit;
    }
    public static void viewStatement(){
        System.out.println("Your Statement!");
        System.out.println("Your balance is: "+userBalance);
        System.out.println("You withdraw "+withdrawMoney);
        System.out.println("You deposit "+ depoMoney);
    }
}