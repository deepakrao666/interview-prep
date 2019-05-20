package prep;

import java.util.HashMap;
import java.util.Map;

public class LeetEasy {

    public int[] twoSumSorted(int[] numbers, int target) {
        int min, max;
        for (int i = 0; i < numbers.length - 1; i++) {
            min = i;
            max = i + 1;

            if ((numbers[min] + numbers[max] == target)) {
                return new int[]{min+1, max+1};
            }
        }
        throw new IllegalArgumentException("nothing found");
    }


    public int[] twoSum(int[] nums, int target) {

        if (nums.length == 1) {
            if (nums[0] == target)
                return nums;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
