
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;

        if (array.length < 2) {
            return 0;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;

        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        int smallestIndex;

        for (int i = 0; i < array.length; i++) {
            smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}
