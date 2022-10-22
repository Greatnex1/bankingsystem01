import java.util.ArrayList;
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

    }

    public static String input(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }


}