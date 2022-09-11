package ro.sda.javaro43.solo_w3.task116;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task116.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(1, Challenge.sum(1));
    }

    @Test
    public void test2() {
        assertEquals(15, Challenge.sum(5));
    }

    @Test
    public void test3() {
        assertEquals(28, Challenge.sum(7));
    }

    @Test
    public void test4() {
        assertEquals(55, Challenge.sum(10));
    }

    @Test
    public void test5() {
        assertEquals(78, Challenge.sum(12));
    }

    @Test
    public void test6() {
        assertEquals(120, Challenge.sum(15));
    }

    @Test
    public void test7() {
        assertEquals(210, Challenge.sum(20));
    }

    @Test
    public void test8() {
        assertEquals(5050, Challenge.sum(100));
    }
}