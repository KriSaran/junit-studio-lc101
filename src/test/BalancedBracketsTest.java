package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testLaunchcodetrue() {
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[LaunchCode]");
        Boolean expected = Boolean.valueOf("true");
        assertTrue(String.valueOf(expected), actual);
    }

    @Test
    public void doubleClosingBrackets() {
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[LaunchCode]]");
        Boolean expected = Boolean.valueOf("true");
        assertFalse(String.valueOf(expected), actual);
    }
    @Test
    public void doubleDifferentBrackets() {
        Boolean actual = BalancedBrackets.hasBalancedBrackets("Launch]Code[");
        Boolean expected = Boolean.valueOf("false");
        assertFalse(String.valueOf(expected), actual);
    }
  @Test(expected = NullPointerException.class)
    public void testNullArgs(){
        BalancedBrackets.hasBalancedBrackets(null);
  }

  @Test
    public void testIntegerError(){
        String temp="10";
        assertTrue(BalancedBrackets.hasBalancedBrackets(String.valueOf(temp instanceof String)));
  }

  @Test
    public void testMultipleBrackets(){
        String temp="[][][]";
      assertTrue(BalancedBrackets.hasBalancedBrackets(temp));
  }

  @Test
    public void testDifferentString(){
        String temp="[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(temp));
  }

  @Test
    public void testDifferentBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
  }
  @Test
  public void testBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
  @Test
    public void emptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
  }
    @Test
    public void testingString(){
        String spec="This is test string with complete brackets inside";
        String data="ThisisString[]message";
        Boolean temp=(BalancedBrackets.hasBalancedBrackets(data));    
        assertTrue(spec,temp);
}
