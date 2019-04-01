package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingElementInTwoArraysTest {

    @Test
    public void testMissingElement(){
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,3,5,6,7,8};
        assertEquals(4, MissingElementInTwoArrays.missingElement(arr,arr2));
    }

}