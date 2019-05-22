package prep;

import java.util.HashMap;
import java.util.Map;

/**
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * For example, there are n =7 socks with colors . ar = [1,2,1,2,1,2,3,5]
 * There is one pair of color 1 and one of color 2.
 * There are three odd socks left, one of each color. The number of pairs is 2.
 */

public class SockMerchant {
    static int res = 0;

    static int sockMerchantProb(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i]))
                map.put(ar[i], map.get(ar[i]) + 1);
            else
                map.put(ar[i], 1);
        }
        res = 0;
        map.forEach((k, v) -> {
            res += map.get(k) / 2;
        });
        return res;
    }

}
