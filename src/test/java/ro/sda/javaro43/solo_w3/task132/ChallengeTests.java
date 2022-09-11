package ro.sda.javaro43.solo_w3.task132;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task132.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(24, Challenge.difference(new int[]{-9, -8, 6, -9, 15, 6}));
    }
    @Test
    public void test2() {
        assertEquals(23, Challenge.difference(new int[]{-5, 6, 18, 4, 16, -2}));
    }
    @Test
    public void test3() {
        assertEquals(29, Challenge.difference(new int[]{-2, 20, -9, -9, -2, -7}));
    }
    @Test
    public void test4() {
        assertEquals(24, Challenge.difference(new int[]{4, -2, 11, -9, 15, 2}));
    }
    @Test
    public void test5() {
        assertEquals(25, Challenge.difference(new int[]{15, 10, 3, -6, 6, 19}));
    }
    @Test
    public void test6() {
        assertEquals(20, Challenge.difference(new int[]{1, 7, 18, -1, -2, 9}));
    }
    @Test
    public void test7() {
        assertEquals(17, Challenge.difference(new int[]{5, 1, -9, 7, -8, -10}));
    }
    @Test
    public void test8() {
        assertEquals(27, Challenge.difference(new int[]{-4, 17, -4, 20, -7, 0}));
    }
    @Test
    public void test9() {
        assertEquals(14, Challenge.difference(new int[]{-2, 11, 11, -3, -3, -3}));
    }
    @Test
    public void test10() {
        assertEquals(19, Challenge.difference(new int[]{1, 15, 14, 20, 10, 6}));
    }
    @Test
    public void test11() {
        assertEquals(15, Challenge.difference(new int[]{4, 17, 12, 2, 10, 2}));
    }
    @Test
    public void test12() {
        assertEquals(23, Challenge.difference(new int[]{-3, 3, 20, 10, 0, 17}));
    }
    @Test
    public void test13() {
        assertEquals(23, Challenge.difference(new int[]{-3, 6, 20, 9, 6, 7}));
    }
    @Test
    public void test14() {
        assertEquals(25, Challenge.difference(new int[]{16, 15, 1, 18, -7, -3}));
    }
    @Test
    public void test15() {
        assertEquals(13, Challenge.difference(new int[]{-7, 4, -4, -3, -8, -9}));
    }
    @Test
    public void test16() {
        assertEquals(10, Challenge.difference(new int[]{15, 8, 17, 18, 10, 10}));
    }
    @Test
    public void test17() {
        assertEquals(30, Challenge.difference(new int[]{-3, 20, 16, 8, 18, -10}));
    }
    @Test
    public void test18() {
        assertEquals(17, Challenge.difference(new int[]{6, 18, 9, 1, 3, 1}));
    }
    @Test
    public void test19() {
        assertEquals(30, Challenge.difference(new int[]{20, 18, -2, -10, -10, 17}));
    }
    @Test
    public void test20() {
        assertEquals(28, Challenge.difference(new int[]{18, 20, -7, -4, -2, -8}));
    }
}