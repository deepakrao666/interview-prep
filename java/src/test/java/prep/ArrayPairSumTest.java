package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayPairSumTest {

    @Test
    public void checkSumTest() {

        int[] arr = {1, 2, 13, 8, 4, 3, 7, 21, 12, 4};
        ArrayPairSum.checkSum(arr, 25);
    }
}