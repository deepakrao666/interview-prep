package advanced;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPatternMatchKMPTest {
    private StringPatternMatchKMP sp;

    @Before
    public void before() {
        sp = new StringPatternMatchKMP();
    }

    @Test
    public void failureTable() {
        String t = "adcadcadcadcf";
        int[] a = sp.failureTable(t);
        int ab = 0;
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0; i < t.length(); i++){
            System.out.print(t.charAt(i)+" ");
        }
    }
}
