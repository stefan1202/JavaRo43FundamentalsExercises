package ro.sda.javaro43.solo_w3.task128;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task128.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(false, Challenge.abcmath(1, 2, 3));
    }

    @Test
    public void test2() {
        assertEquals(false, Challenge.abcmath(69, 15, 9));
    }

    @Test
    public void test3() {
        assertEquals(false, Challenge.abcmath(9, 2, 52));
    }

    @Test
    public void test4() {
        assertEquals(false, Challenge.abcmath(5, 2, 3));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.abcmath(5, 2, 1));
    }

    @Test
    public void test6() {
        assertEquals(true, Challenge.abcmath(261, 2, 1));
    }

    @Test
    public void test7() {
        assertEquals(true, Challenge.abcmath(22, 2, 22));
    }

    @Test
    public void test8() {
        assertEquals(true, Challenge.abcmath(69, 12, 3));
    }
}