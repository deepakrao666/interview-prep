package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubArrayTest {

    @Test
    public void atMostSum() {

        int arr[] = { 1, 2, 1, 0, 1, 1, 0 };
        int n = arr.length;
        int k = 4;

        System.out.println(LongestSubArray.atMostSum(arr,n,k));
    }
}
