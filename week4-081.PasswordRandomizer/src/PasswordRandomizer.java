import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private String alphabet;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.alphabet = "abcdefghijklmnopqrstuvwxyz";
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = "";
        int index;

        while (i < this.length) {
            index = this.random.nextInt(26);
            password += this.alphabet.charAt(index);
            i++;
        }
        return password;
    }
}
