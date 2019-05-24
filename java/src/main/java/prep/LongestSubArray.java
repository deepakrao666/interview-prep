package prep;

public class LongestSubArray {
    /**
     * geekForGeeks
     * Given an array of integers, our goal is to find the length of
     * largest subarray having sum of its elements atmost ‘k’ where k>0.
     */

    public static int atMostSum(int arr[], int n, int k) {
        int sum = 0;
        int count = 0, max = 0;
        for (int i = 0; i < n; i++) {
            // If adding current element doesn't
            // cross limit add it to current window
            if ((sum + arr[i]) <= k) {
                sum += arr[i];
                count++;
            }
            // Else, remove first element of current
            // window.
            else if (sum != 0) {
                sum = sum - arr[i - count] + arr[i];
            }
            // keep track of max length.
            max = Math.max(count, max);
        }
        return max;
    }

}
