import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        int maxUserTries = 5;
        Scanner userInputScanner = new Scanner(System.in);

        while (maxUserTries > 0) {
            System.out.println("Guess a number between 1 and 100");
            int userGuess = userInputScanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("You guessed the number!");
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("The number is lower");
            } else {
                System.out.println("The number is higher");
            }
            maxUserTries--;
        }
        if (maxUserTries == 0) {
            System.out.println("You ran out of tries!");
        }
    }
}
