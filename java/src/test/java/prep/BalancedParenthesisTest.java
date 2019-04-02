package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedParenthesisTest {

    @Test
    public void checkTester() {

        assertTrue(BalancedParenthesis.check("()"));
        assertTrue(BalancedParenthesis.check("({[()]})"));
        assertFalse(BalancedParenthesis.check("({{)}})"));
        assertFalse(BalancedParenthesis.check("({{)}})"));
        assertFalse(BalancedParenthesis.check("([})"));
        assertFalse(BalancedParenthesis.check(")}})"));
        assertFalse(BalancedParenthesis.check(")"));
        assertFalse(BalancedParenthesis.check("("));
        assertFalse(BalancedParenthesis.check("(())(("));
        assertFalse(BalancedParenthesis.check("(())))"));
    }
}