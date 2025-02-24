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
}