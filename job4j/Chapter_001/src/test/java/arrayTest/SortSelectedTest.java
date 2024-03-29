package arrayTest;

import org.junit.Test;
import ru.kibis.dataTypes.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {5, 2, 1,3, 4};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {5, 2, 1};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 5};
        assertThat(result, is(expect));
    }
}
