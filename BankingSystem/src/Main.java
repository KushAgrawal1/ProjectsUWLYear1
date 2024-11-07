import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Setting all Button/String to ensure user to click any on the following option
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";

        // User intial balance
        int IntBalance = 0;

        // Setting scanner object for input of Alphabet above
            Scanner input = new Scanner(System.in);
        // Setting scanner object for input of Numerical Data
            Scanner NumInput = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------WELCOME TO KUSH BANKING SYSTEM----------------------------------------------------------------\n");
            while (true){
                // Telling User Info about OPTIONS
                System.out.println("------------------------------------------------- Menu -------------------------------------------------");
                System.out.println("Enter A for Bank Information");
                System.out.println("Enter B for Bank Deposit Amount");
                System.out.println("Enter C for Bank Withdraw Amount");
                System.out.println("Enter D for Bank Check Balance");
                System.out.println("Enter E for Bank EXIT");
                System.out.println("--------------------------------------------------------------------------------------------------------");

                // In loop asking user to input Data always
            String setinput = input.nextLine();
                if (setinput.equals(A)){
                    // Setting User INFO
                    System.out.println("--------Your Banking Info:--------");
                    System.out.println("\n Name is - KUSH AGRAWAL\n");
                    System.out.println(" Acc No. is - 300122456777 \n");
                    System.out.println(" Opened On " + LocalDate.now());
                } else if (setinput.equals(B)) {
                    // Asking user to deposit balance
                    System.out.println("How Much balance to Deposit = ");
                    // UserInput the deposit amount
                    int k = NumInput.nextInt();
                    // If user input any false data then it will print below mwssage
                    if (k < 0){
                        System.out.println("Enter Valid Input");
                    }
                    // After user input deposit amount it will add it in Intial balance using below formula and store it
                    IntBalance = k + IntBalance;
                    // Print Balance
                    System.out.println("Your Balance is " + IntBalance);
                } else if (setinput.equals(C)) {
                    // Print how much amount to withdraw
                    System.out.println("How much Amount To withdraw = ");
                    // Taking user data on how much money to withdraw
                    int W = NumInput.nextInt();
                    // If balance is low then withdraw amount then it will not allow to deduct
                    if (IntBalance < W){
                        System.out.println("Your balance is Low to withdraw!!! ");
                    }
                    // Formula
                    IntBalance = IntBalance - W;
                    // Printing Message
                    System.out.println("-----Your Remaining Balance----- " + IntBalance );
                }
                else if (setinput.equals(D)) {
                    System.out.println("----Your Balance is---- " + IntBalance);
                } else if (setinput.equals(E)) {
                    System.out.println("-------------------------------Thanks for using KUSH BANK-------------------------------");
                    break;
                } else {
                      {
                        System.out.println("Enter Valid Input !!!");
                    }
                }
            }

            input.close();
            NumInput.close();
        }
    }
