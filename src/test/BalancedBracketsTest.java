package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void hasEqualNumOfBothBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[[]]][][]"));
    }

    @Test(expected = AssertionError.class)
    public void returnsFalseWhenUntrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][[]"));
        fail("Should not reach here");
    }

    @Test
    public void returnsTrueWhenNoInput() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void inputButWithNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Ammar was (here)"));
    }

    @Test(expected = AssertionError.class)
    public void onlyPositives() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[["));
    }
    @Test(expected = AssertionError.class)
    public void onlyNegatives() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]]]]"));
    }
}
