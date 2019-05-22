package prep;

public class CloudHR {
    /**
     * you can jump 1 or 2 times, solution is always there.
     * In array [0 0 0 0 1 0]
     * if there is 1 jump over it.
     *
     * @param c
     * @return
     */
    static int jumpingOnClouds(int[] c) {
        int res = 0;
        for (int i = 0; i < c.length; ) {
            if ((i + 2) < c.length && c[i + 2] == 0) {
                res += 1;
                i += 2;
            } else if ((i + 1) < c.length && c[i + 1] == 0) {
                res += 1;
                i += 1;
            }else if( i == c.length - 1)
                break;

        }
        return res;
    }

}
