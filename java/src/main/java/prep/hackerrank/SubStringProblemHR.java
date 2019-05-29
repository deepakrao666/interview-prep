package prep.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SubStringProblemHR {
    /**
     * Check if there is any common substring between s1 and s2
     * --------
     * 2
     * hello
     * world
     * hi
     * world
     * <p>
     * OP :
     * YES
     * NO
     * --------
     *
     * @param s1
     * @param s2
     * @return
     */
    static String res = "No";
    static String twoStrings(String s1, String s2) {
        Map<Character, Integer> magMap = wordCount(s1.toCharArray());
        Map<Character, Integer> noteMap = wordCount(s2.toCharArray());
        System.out.println(magMap.toString());
        System.out.println(noteMap.toString());
        noteMap.forEach((k, v) -> {
            System.out.println(k);
            if (magMap.containsKey(k))
                res = "Yes";
        });
        return res;
    }

    private static Map<Character, Integer> wordCount(char[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (char s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }
}
