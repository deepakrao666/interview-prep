package prep.n26;


public class AnagramProblem {
    /**
     * Coding challenge for phone interview at N26
     * For 2 strings where s1.length > s2.length
     * find how many anagrams of string s2 are in string s1
     */
    public static void solution(String s1, String s2){
        int MAX = 256;
        if(s1.length() < s2.length()){
            System.out.println("no anagram");
            return;
        }
        char[] arr = s2.toLowerCase().toCharArray();
        int M = s1.length();
        int N = s2.length();

        // countP[]:  Store count of all
        // characters of pattern
        // countTW[]: Store count of current
        // window of text
        char[] countP = new char[MAX];
        char[] countTW = new char[MAX];
        for (int i = 0; i < M; i++)
        {
            (countP[s1.charAt(i)])++;
            (countTW[s2.charAt(i)])++;

            System.out.println(countP[i] +" : "+countTW[i]);
        }

    }
}
