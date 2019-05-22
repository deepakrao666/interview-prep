package advanced;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class NewYearChaosHR {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribe = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("too chaotic");
                return;
            }
        }
        for (int i = 0; i < q.length; i++) {
            for (int j = i + 1; j < q.length; j++) {
                if (q[i] > q[j]) {
                    int tmp = q[j];
                    q[j] = q[i];
                    q[i] = tmp;
                    bribe++;
                }
            }
        }
        System.out.println(bribe);
    }
}
