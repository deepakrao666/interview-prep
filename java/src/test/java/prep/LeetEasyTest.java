package prep;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetEasyTest {
    LeetEasy leetEasy;

    @Before
    public void before() {
        leetEasy = new LeetEasy();
    }

    @Test
    public void twoSum() {
        int[] a = leetEasy.twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 2, 11}, 13);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void twoSumSorted() {
        int[] a = leetEasy.twoSumSorted(new int[]{2, 7, 11, 15}, 9);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
