import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    // Sort strings alphabetically
    public static String[] sortStringsAlphabetically(String[] array) {
        Arrays.sort(array);
        return array;
    }

    // Sort strings in reverse alphabetical order
    public static String[] sortStringsReverseAlphabetically(String[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }

    // Shuffle the array
    public static int[] shuffleArray(int[] array) {
        List<Integer> list = Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new));
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // Reverse the array
    public static int[] reverseArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }