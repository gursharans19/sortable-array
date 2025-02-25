import org.junit.Test;
import static org.junit.Assert.*;

public class SortableArrayTest {

    @Test
    public void testSortIntegersAscending() {
        int[] array = {5, 3, 1, 4, 2};
        int[] sorted = SortableArray.sortIntegersAscending(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sorted);
    }

    @Test
    public void testSortIntegersDescending() {
        int[] array = {5, 3, 1, 4, 2};
        int[] sorted = SortableArray.sortIntegersDescending(array);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, sorted);
    }

    @Test
    public void testSortStringsAlphabetically() {
        String[] array = {"banana", "apple", "cherry"};
        String[] sorted = SortableArray.sortStringsAlphabetically(array);
        assertArrayEquals(new String[]{"apple", "banana", "cherry"}, sorted);
    }

    @Test
    public void testSortStringsReverseAlphabetically() {
        String[] array = {"banana", "apple", "cherry"};
        String[] sorted = SortableArray.sortStringsReverseAlphabetically(array);
        assertArrayEquals(new String[]{"cherry", "banana", "apple"}, sorted);
    }

    @Test
    public void testShuffleArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] shuffled = SortableArray.shuffleArray(array);
        assertNotEquals(array, shuffled); // The shuffled array should not match the original
    }
}
