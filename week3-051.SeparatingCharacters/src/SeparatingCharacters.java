
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int index = 0;
        while (index < name.length()) {
            System.out.println((index + 1) + ". character: " + name.charAt(index));
            index++;
        }
    }
}
