package ro.sda.javaro43.solo_w1.task32;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(100, Challenge.squared(10));
    }

    @Test
    public void test2() {
        assertEquals(4761, Challenge.squared(69));
    }

    @Test
    public void test3() {
        assertEquals(443556, Challenge.squared(666));
    }

    @Test
    public void test4() {
        assertEquals(441, Challenge.squared(-21));
    }

    @Test
    public void test5() {
        assertEquals(441, Challenge.squared(21));
    }
}