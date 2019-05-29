package prep.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.summingInt;

public class RansomHR {
    /**
     * 6 4
     * give me one grand today night
     * give one grand today
     * OP : YES
     * ------------------
     * 6 5
     * two times three is not four
     * two times two is four
     * OP : NO
     * ------------------
     *
     * @param s1
     * @param s2
     */
    static String res = "";

    static void checkMagazine(String[] s1, String[] s2) {
        if (s1.length < s2.length) {
            System.out.println("NO");
            return;
        }

        Map<String, Integer> magMap = wordCount(s1);
        Map<String, Integer> noteMap = wordCount(s2);

        noteMap.forEach((k, v) -> {
            if (magMap.containsKey(k)) {
                System.out.println("note = k: " + k + noteMap.get(k) + ", map = " + magMap.get(k));
                if (noteMap.get(k) > magMap.get(k)) {
                    System.out.println("1");
                    res = "No";
                    return;
                }
            } else {
                System.out.println("2");
                res = "No";
                return;
            }
        });
        if (!res.equals("No")) {
            System.out.println(3);
            res = "Yes";
        }

        System.out.print(res);
    }

    private static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {

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
