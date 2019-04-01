package prep;

public class LargestContiguousSum {

    static int contiguousSum(int arr[]) {
        if (arr.length == 0)
            return 0;

        int maxSum = 0, currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = arr[i] < currentSum + arr[i] ? currentSum + arr[i] : arr[i];
            maxSum = maxSum < currentSum ? currentSum : maxSum;
        }
        return maxSum;
    }
}
