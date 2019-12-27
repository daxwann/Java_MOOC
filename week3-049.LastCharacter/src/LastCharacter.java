import java.util.Scanner;


public class LastCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char lastChar = lastCharacter(name);
        System.out.println("Last character: " + lastChar);
    }

    public static char lastCharacter(String name) {
        return name.charAt(name.length() - 1);
    }
}
