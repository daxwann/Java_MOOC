
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int maxPower = Integer.parseInt(reader.nextLine());
        int result = 0;
        double currPower = 0.0;

        while (currPower <= maxPower) {
            result += (int)Math.pow(2.0, currPower);
            currPower++;
        }
        System.out.println("The result is " + result);
    }
}
