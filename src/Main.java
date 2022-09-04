import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
private static final Bank banking = new Bank();
   private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){


        displayMenu();
    }

    private static void displayMenu() {
        String prompt ="""
                 Welcome to Little's Mobile Banking App
                 1. Create an Account
                 2. Deposit
                 3. Withdraw
                 4. View Bank Details
                 5. View Balance
                 0. Exit
                """;
        String userInput = input(prompt);
        switch (userInput.charAt(0)){
            case '1' -> CreateAnAccount();
            case '2' -> Deposit();
            case '3' ->  Withdraw ();
            case '4' -> viewDetails();
            case '5' -> viewBank();

        }


    }

    private static void viewBank() {
        Bank bank = new Bank();

        bank.viewAccountDetails();


    }

    private static void CreateAnAccount() {
        User user = new User();
        try{
            user.setFirstname(input("Enter your firstname"));
            user.setLastname(input("Enter your lastname"));
//        user.setAge(input("Enter your age"));
            user.setGender(input("What is your gender"));

        } catch (InputMismatchException e){
            System.err.println("Enter alphabets and not numbers"+ e.getMessage());
        }
        user.setPhoneNumber(input("Enter your phone number"));
        user.setEmail(input("Enter your email"));

//        banking.saveUser(user);

        System.out.println(  user.getFirstname() + " "+ user.getLastname() + " Your account has been created successfully ");


        displayMenu();
    }

    private static void Deposit() {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much are you depositing ?");
        int doub = scanner.nextInt();
        bank.deposit(doub);
        System.out.println("Your account balance asa been updated to " + bank.getBalance());
        displayMenu();



//        User user = new User();
//        System.out.println("Welcome to your deposit page " + user.getFirstname());
    }

    private static void Withdraw() {
        Bank bank = new Bank();
            Scanner scan = new Scanner(System.in);

                try {
                    System.out.println("How much are you withdrawing ?");
                    int with = scan.nextInt();

                    bank.withdraw(with);
                } catch (InputMismatchException e) {
                    System.err.println(e + " Invalid input, Enter an integer");

                }


        displayMenu();

    }


    private static void viewDetails() {
        User user = new User();
        user.viewUser();
//          user.viewUser();
//        user.setFirstname(input(user.getFirstname()));
////        user.getFirstname();
//        user.setFirstname(user.getFirstname());
//        System.out.println(user);
//        System.out.println();
    }

    public static String input(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }

}
