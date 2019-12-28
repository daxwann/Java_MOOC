import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        if (text.length() < 2) {
            return true;
        }

        int index = 0;
        while (index <= text.length() / 2) {
            if (text.charAt(index) != text.charAt(text.length() - 1 - index)) {
                return false;
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
