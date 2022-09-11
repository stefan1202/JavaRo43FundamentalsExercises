package ro.sda.javaro43.solo_w4.task145;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(4, Challenge.bitwiseAND(7, 12));
    }

    @Test
    public void test2() {
        assertEquals(15, Challenge.bitwiseOR(7, 12));
    }

    @Test
    public void test3() {
        assertEquals(11, Challenge.bitwiseXOR(7, 12));
    }

    @Test
    public void test4() {
        assertEquals(0, Challenge.bitwiseAND(32, 17));
    }

    @Test
    public void test5() {
        assertEquals(49, Challenge.bitwiseOR(32, 17));
    }

    @Test
    public void test6() {
        assertEquals(49, Challenge.bitwiseXOR(32, 17));
    }

    @Test
    public void test7() {
        assertEquals(1, Challenge.bitwiseAND(13, 19));
    }

    @Test
    public void test8() {
        assertEquals(31, Challenge.bitwiseOR(13, 19));
    }

    @Test
    public void test9() {
        assertEquals(30, Challenge.bitwiseXOR(13, 19));
    }
}