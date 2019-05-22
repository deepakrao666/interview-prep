package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Clutter inc test hacker rank question 2

/**
 * if given a list of phrases
 * concat string whos last-word and first-word are matching
 * eg:
 * "fast and furious"
 * "fast 5"
 * "the movie name is fast"
 * "fast and furious: tokyo drift"
 *
 * Output :
 * "movie name is fast and furious"
 * "movie name is fast 5"
 * "movie name is fast and furious: tokyo drift"
 */

public class ClutterInc_2_05202019 {

    public static void problem() {
        List<String> strings = generate_phrases(Arrays.asList("writing code", "code rocks", "mission impossible",
                "mission complete", "this mission"));
        System.out.println("some length " + strings.size());
        strings.forEach(System.out::println);
    }

    public static List<String> generate_phrases(List<String> phrases) {
        List<String> res = new ArrayList<>();
        List<Phrase> ph = new ArrayList<>();
        phrases.forEach(e -> {
            String[] s = e.split(" ");
            Phrase p = new Phrase();
            p.start = s[0];
            p.end = s[s.length - 1];
            p.phrase = e;
            ph.add(p);
        });

        int i = 0;
        while (i < ph.size()) {

            for (int j = 0; j < ph.size(); j++) {
                if (j != i) {
                    Phrase master = ph.get(i);
                    Phrase target = ph.get(j);
                    if (master.end.equals(target.start)) {
                        res.add(master.phrase + "" + target.phrase.substring(target.start.length()));
                    }
                }
            }
            i++;
        }
        return res;
    }

}

class Phrase {
    String start;
    String end;
    String phrase;
}
