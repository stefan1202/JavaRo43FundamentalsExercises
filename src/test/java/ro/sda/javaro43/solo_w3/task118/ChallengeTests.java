package ro.sda.javaro43.solo_w3.task118;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task118.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(2, Challenge.factorial(2));
    }

    @Test
    public void test2() {
        assertEquals(720, Challenge.factorial(6));
    }

    @Test
    public void test3() {
        assertEquals(6, Challenge.factorial(3));
    }

    @Test
    public void test4() {
        assertEquals(479001600, Challenge.factorial(12));
    }

    @Test
    public void test5() {
        assertEquals(120, Challenge.factorial(5));
    }
}