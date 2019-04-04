package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingStuffTest {

    @Test
    public void quickSortTest() {
        int arr[] = {1,2,4,4,6,2,1,4,3};

        SortingStuff.quickSort(arr, 0, arr.length-1);

        for(int i : arr){
            System.out.println(i);
        }
    }
}