
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();
        int firstIndex = 0;
        int secondIndex = 0;

        if (firstWord.length() < secondWord.length()) {
            System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
        }

        while (firstIndex < firstWord.length()) {
            if (firstWord.charAt(firstIndex) == secondWord.charAt(secondIndex)) {
                secondIndex++;
            } else {
                secondIndex = 0;
            }

            if (secondIndex == secondWord.length()) {
                System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
                return;
            }
            firstIndex++;
        }

        System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
    }
}
