import java.time.LocalDate;
import java.util.Scanner;

public class BankingSystemChange {

    public static void main(String[] args) {
        // User's initial balance
        int balance = 0;

        // Scanner object for all input
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------WELCOME TO KUSH BANKING SYSTEM----------------------------------------------------------------\n");

        while (true) {
            // Displaying menu options
            System.out.println("------------------------------------------------- Menu -------------------------------------------------");
            System.out.println("Enter A for Bank Information");
            System.out.println("Enter B for Bank Deposit Amount");
            System.out.println("Enter C for Bank Withdraw Amount");
            System.out.println("Enter D for Bank Check Balance");
            System.out.println("Enter E for Bank EXIT");
            System.out.println("--------------------------------------------------------------------------------------------------------");

            String option = input.nextLine().toUpperCase();  // Accepting input and converting to uppercase

            if (option.equals("A")) {
                // Display account information
                System.out.println("--------Your Banking Info:--------");
                System.out.println("\nName: KUSH AGRAWAL");
                System.out.println("Account No.: 300122456777");
                System.out.println("Opened On: " + LocalDate.now());

            } else if (option.equals("B")) {
                // Deposit money
                System.out.print("Enter amount to deposit: ");
                String depositInput = input.nextLine();

                // Validate if input is an integer
                if (isInteger(depositInput)) {
                    int deposit = Integer.parseInt(depositInput);

                    if (deposit < 0) {
                        System.out.println("Amount cannot be negative.");
                    } else {
                        balance += deposit;
                        System.out.println("Deposit successful! Your new balance is " + balance);
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                }

            } else if (option.equals("C")) {
                // Withdraw money
                System.out.print("Enter amount to withdraw: ");
                String withdrawInput = input.nextLine();

                // Validate if input is an integer
                if (isInteger(withdrawInput)) {
                    int withdraw = Integer.parseInt(withdrawInput);

                    if (withdraw < 0) {
                        System.out.println("Amount cannot be negative.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful! Your remaining balance is " + balance);
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                }

            } else if (option.equals("D")) {
                // Check balance
                System.out.println("Your current balance is: " + balance);

            } else if (option.equals("E")) {
                // Exit
                System.out.println("Thank you for using KUSH BANK. Goodbye!");
                input.close();  // Close scanner before exiting
                return;  // Exit the program

            } else {
                System.out.println("Invalid option. Please enter a valid choice.");
            }
        }
    }

    // Helper method to check if a string is a valid integer
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
