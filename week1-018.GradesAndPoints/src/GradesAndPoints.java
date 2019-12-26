
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int score = Integer.parseInt(reader.nextLine());
        if (score >= 0 && score <= 29) {
            System.out.println("\nGrade: failed");
        } else if (score >= 30 && score <= 34) {
            System.out.println("\nGrade: 1");
        } else if (score >= 35 && score <= 39) {
            System.out.println("\nGrade: 2");
        } else if (score >= 40 && score <= 44) {
            System.out.println("\nGrade: 3");
        } else if (score >= 45 && score <= 49) {
            System.out.println("\nGrade: 4");
        } else if (score >= 50 && score <= 60) {
            System.out.println("\nGrade: 5");
        }
    }
}
