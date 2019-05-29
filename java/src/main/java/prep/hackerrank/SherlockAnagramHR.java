package prep.hackerrank;

import java.util.Arrays;

public class SherlockAnagramHR {
    /**
     * Count number of anagrams in a string.
     * ------------
     * 2
     * ifailuhkqq
     * kkkk
     * <p>
     * OP :
     * 3
     * 10
     * ------------
     *
     * @param s
     * @return
     */
    // Complete the sherlockAndAnagrams function below.
    public static int sherlockAndAnagrams(String s) {
        int res = 0;
        int n = s.length();
        int max = (n * n) - (((n * n) - n) / 2);
        String[] possibleCombinations = new String[max];
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i <= j) {
                    String temp = s.substring(i, j+1);
                    char[] c = temp.toCharArray();
                    Arrays.sort(c);
                    temp = new String(c);
                    possibleCombinations[p] = temp;
                    p++;
                }

            }
        }
//        Arrays.sort(possibleCombinations);
//        for(String str: possibleCombinations ){
//            System.out.print(str+ " ");
//        }
        for(int i = 0; i < possibleCombinations.length; i++ ){
            for(int j = i+1; j < possibleCombinations.length; j++){
                if(possibleCombinations[i].equals(possibleCombinations[j])){
                  res ++;
                }
            }
        }

        return res;
    }


}
