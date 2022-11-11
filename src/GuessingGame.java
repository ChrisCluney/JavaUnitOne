import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();


        int numOfTries = 0;
        int randomNum = rand.nextInt(100);

        System.out.println("Howdy, what's your name?");

        String name = scan.nextLine();

        System.out.println( name + ", I'm thinking of a number between 1 and 100.");

        while (true) {
            int userGuess;
            try {
                userGuess = scan.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = scan.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            numOfTries = numOfTries + 1;

            if ( userGuess < 1 || userGuess > 100) {
                System.out.println("Ha! Someone is not listening, try again.");
                continue;

            } else if (userGuess < randomNum) {
                System.out.println("Your guess is too low, try again.");

            } else if (userGuess > randomNum) {
                System.out.println("You guess is too high, try again.");


        } else {
                System.out.println("Well done, " + name + "! You found my number in " + numOfTries + " tries!");
                break;
            }
        }

        scan.close();
    }

}
