package company;

import java.util.Scanner;

public class Password_Checking {
    public static void main(String[] args) {
        String set_passcode = "changeme";
        Scanner userInputPassword = new Scanner(System.in);
        int attempt = 0;
        while (set_passcode.equals(userInputPassword) == false && attempt<=5 ){
            System.out.println("Please enter correct password");
            String guess = userInputPassword.nextLine();
            attempt++;
            if (guess.equals(set_passcode) == true){
                System.out.println("Access Granted successfully");
                break;
            } else if (guess.equals(set_passcode) == false){
                System.out.println("Access Denied");
            } if (attempt == 5){
                System.out.println("Sorry access cant be granted try again later");
                break;
            }

        }




    }
}
