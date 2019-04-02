package prep;

// sum of 2 values in array add to K

import java.util.*;

public class ArrayPairSum {
    static void checkSum(int arr[], int k){
        Arrays.sort(arr);
        Set<Integer> set = new LinkedHashSet<>();
        for(int i: arr){
            set.add(i);
        }
        System.out.println();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int next = it.next();
            int target = k - next;
            if(set.contains(target)){
                System.out.println(next +"::"+target);
                it.remove();
            }
        }
    }
}
