public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int stars = 1;
        while (stars <= size) {
            printWhitespaces(size - stars);
            printStars(stars);
            stars++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stars = 1;
        int stump = 0;
        while (stars <= height) {
            printWhitespaces(height - stars);
            printStars(stars * 2 - 1);
            stars++;
        }

        while (stump < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            stump++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
