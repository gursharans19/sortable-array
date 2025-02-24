import java.util.Arrays;

public class SortableArray {

    // Sort integers in ascending order
    public static int[] sortIntegersAscending(int[] array) {
        Arrays.sort(array);
        return array;
    }

    // Sort integers in descending order
    public static int[] sortIntegersDescending(int[] array) {
        Arrays.sort(array);
        reverseArray(array);
        return array;
    }

    // Helper method to reverse an array
    private static void reverseArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}