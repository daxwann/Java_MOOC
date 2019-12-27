
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 0;

        // program your solution here. Do not touch the above lines!
        int guess = getGuess(reader);

        while (guess != numberDrawn) {
            count++;
            checkGuess(guess, numberDrawn, count);
            guess = getGuess(reader);
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    public static int getGuess(Scanner reader) {
        System.out.print("Guess a number: ");
        int input = Integer.parseInt(reader.nextLine());
        return input;
    }

    public static void checkGuess(int guess, int target, int count) {
        if (guess > target) {
            System.out.println("The number is lesser, guesses made: " + count);
        } else if (guess < target) {
            System.out.println("The number is greater, guesses made: " + count);
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
