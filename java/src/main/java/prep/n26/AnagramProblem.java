package prep.n26;


import java.util.HashMap;
import java.util.Map;

public class AnagramProblem {
    /**
     * Coding challenge for phone interview at N26
     * For 2 strings where s1.length > s2.length
     * find how many anagrams of string s2 are in string s1
     */
    private static Map<Character, Integer> map;

    public static void solution(String s1, String s2) {
        if (s1.length() < s2.length()) {
            System.out.println("no anagram");
            return;
        }

        int p, count = 0;
        for(int i = 0; i < s1.length(); i++ ){
            p = i;
            while( p < s2.length() ){
                makeMap(s2);
                char target = s1.charAt(p);
                if( map.containsKey(target)){

                    if(map.get(target) == 0){
                        map.remove(target);
                    }else {
                        p++;
                        map.put( target, map.get(target)-1);
                    }
                }
            }
            if( p == s2.length()){
                    count++;
            }
        }
        System.out.println("No. of anagrams found are = " + count );

    }

    private static void makeMap(String s) {
        char[] cArr = s.toCharArray();
        map = new HashMap<>();
        for (char i : cArr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map.toString());
    }
}
