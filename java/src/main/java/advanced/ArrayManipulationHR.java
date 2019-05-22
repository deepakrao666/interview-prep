package advanced;

public class ArrayManipulationHR {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];
        long res = 0;
        for (int row = 0; row < queries.length; row++) {

            int from = queries[row][0]-1;
            int to = queries[row][1]-1;
            int by = queries[row][2];

            for (int i = from; i <= to; i++) {
                arr[i] = arr[i] + by;
                if(res < arr[i])
                    res = arr[i];
            }
        }
        return res;
    }
}
