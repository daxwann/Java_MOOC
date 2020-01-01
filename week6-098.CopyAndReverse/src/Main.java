

public class Main {

    public static void main(String[] args) {
        // write testcode here

    }

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }

        return reverse;
    }
}
