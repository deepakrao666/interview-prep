package prep;

public class RepeatedAHR {
    /**
     * Find reapead a if string @param s is repeated to the @param n length
     * @param s
     * @param n
     * @return
     */
    static long repeatedString(String s, long n) {
        long m = n / s.length(), r = n % s.length(), countOfAInS = 0;
        int[] pos = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                pos[i] = i;
                countOfAInS += 1;
            } else
                pos[i] = -1;
        }
//        System.out.println("m = "+m+" r = "+r);
        countOfAInS = m*countOfAInS;

        for(int i = 0; i < r; i++){
            if(pos[i] != -1){
//                System.out.println("p["+i+"] = "+pos[i]);
                countOfAInS +=1;
            }
        }
        return countOfAInS;
    }
}
