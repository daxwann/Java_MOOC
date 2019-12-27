import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int index = name.length() - 1;
        while (index >= 0) {
            System.out.print(name.charAt(index));
            index--;
        }
        System.out.print("\n");
    }
}
