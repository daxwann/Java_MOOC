import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> scores;
        String[] distribution;

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        scores = addScores(reader);
        distribution = getGradeDistribution(scores);
        printGradeDistribution(distribution);
        System.out.println("Acceptance percentage: " + calculateAcceptancePercentage(scores));
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }

    public static ArrayList<Integer> addScores(Scanner reader) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        int score;

        while (true) {
            score = Integer.parseInt(reader.nextLine());
            if (score >= 0 && score <= 60) {
                scores.add(score);
            } else if (score < 0) {
                break;
            }
        }

        return scores;
    }

    public static String[] getGradeDistribution(ArrayList<Integer> scores) {
        String[] distribution = {"","","","","",""};

        for (int score : scores) {
            if (score >= 0 && score <= 29) {
                distribution[0] += "*";
            } else if (score >= 30 && score <= 34) {
                distribution[1] += "*";
            } else if (score >= 35 && score <= 39) {
                distribution[2] += "*";
            } else if (score >= 40 && score <= 44) {
                distribution[3] += "*";
            } else if (score >= 45 && score <= 49) {
                distribution[4] += "*";
            } else if (score >= 50 && score <= 60) {
                distribution[5] += "*";
            }
        }

        return distribution;
    }

    public static void printGradeDistribution(String[] distribution) {
        System.out.println("Grade distribution:");
        for (int i = distribution.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + distribution[i]);
        }
    }

    public static double calculateAcceptancePercentage(ArrayList<Integer> scores) {
        int accepted = 0;

        for (int score : scores) {
            if (score > 29) {
                accepted++;
            }
        }

        return 100.0 * accepted / scores.size();
    }
}
