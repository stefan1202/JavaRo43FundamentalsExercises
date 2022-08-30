package ro.sda.javaro43.solo_w0.task11;

import org.junit.Test;
import ro.sda.javaro43.solo_w0.task11.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(1, Challenge.remainder(7, 2));
    }

    @Test
    public void test2() {
        assertEquals(3, Challenge.remainder(3, 4));
    }

    @Test
    public void test3() {
        assertEquals(-9, Challenge.remainder(-9, 45));
    }

    @Test
    public void test4() {
        assertEquals(0, Challenge.remainder(5, 5));
    }
}