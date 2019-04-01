package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestContiguousSumTest {
    @Test
    public void testWithSimple(){
        int[] a = {3, 4, 0 ,-20, 2};
        assertEquals(7, LargestContiguousSum.contiguousSum(a));
    }

}