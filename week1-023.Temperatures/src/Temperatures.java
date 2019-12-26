
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.print("Enter a floating point number: ");
            double num = Double.parseDouble(reader.nextLine());
            if (num >= -30.0 && num <= 40.0) {
                Graph.addNumber(num);
            }
        }
    }
}
