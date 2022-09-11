package ro.sda.javaro43.solo_w3.task126;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task126.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.sameCase("HELLO"));
    }

    @Test
    public void test2() {
        assertEquals(false, Challenge.sameCase("HEllo"));
    }

    @Test
    public void test3() {
        assertEquals(false, Challenge.sameCase("mArmALadE"));
    }

    @Test
    public void test4() {
        assertEquals(true, Challenge.sameCase("marmalade"));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.sameCase("MARMALADE"));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.sameCase("ketchUP"));
    }

    @Test
    public void test7() {
        assertEquals(true, Challenge.sameCase("pickle"));
    }

    @Test
    public void test8() {
        assertEquals(true, Challenge.sameCase("MUSTARD"));
    }
}