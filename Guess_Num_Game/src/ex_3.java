// BASIC GUESS NUMBER GAME IN JAVA
// FUNCTIONS :- COUNT NUMBER OF ATTEMPT , GENERATE RANDOM NUMBER , DISPLAY YOUR GAP BETWEEN CORRECT ANSWER
import java.util.Random;
import java.util.Scanner;

class Game {
    int inputnumber;
    int RandNum;
    int attempt = 1;

    public void inputnos (){
        System.out.println("Enter Any number Please");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    public void GuessNo (){
        Random rc = new Random();
        RandNum = rc.nextInt(100);
    }
    public void checkNumber(){

        while (inputnumber != RandNum){
            System.out.println("inCorrect Try again");
            attempt++;
            inputnos();

            if (inputnumber == RandNum){
                System.out.println("Correct Guessed" + " You took " + attempt +" attempts");
                break;
            } else if (inputnumber > RandNum) {
                System.out.println("Try Smaller please");
            } else if (inputnumber < RandNum) {
                System.out.println("Try Bigger please");
            }
        }
    }
}
public class ex_3 {
    public static void main(String[] args) {
        Game game = new Game();
        game.inputnos();
        game.GuessNo();
        game.checkNumber();

    }
}