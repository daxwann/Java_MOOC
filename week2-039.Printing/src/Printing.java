public class Printing {

    public static void printStars(int amount) {
        // 39.1
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int row = 0;

        while (row < sideSize) {
            printStars(sideSize);
            row++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int row = 0;

        while (row < height) {
            printStars(width);
            row++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int row = 1;

        while (row <= size) {
            printStars(row);
            row++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }


}
