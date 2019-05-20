package prep;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClutterInc05202019Test {
    public ClutterInc05202019 clutter;

    @Before
    public void before() {
    clutter = new ClutterInc05202019();
    }

    @Test
    public void problem() {
        clutter.problem();
    }
}
