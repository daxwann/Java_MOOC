import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input;

        while (true) {
            System.out.print("Type a word: ");
            input = reader.nextLine();

            if (input.isEmpty()) {
                break;
            }

            words.add(input);
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
