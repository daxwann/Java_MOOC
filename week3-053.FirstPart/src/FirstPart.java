
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Length of the first part: ");
        int limit = Integer.parseInt(reader.nextLine());
        String part = name.substring(0, limit);
        System.out.println("Result: " + part);
    }
}
