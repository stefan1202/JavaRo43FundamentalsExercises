package ro.sda.javaro43.solo_w4.task138;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.lastDig(1, 1, 1));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.lastDig(12, 15, 10));
    }

    @Test
    public void test3() {
        assertEquals(true, Challenge.lastDig(15228, 9209, 72162));
    }

    @Test
    public void test4() {
        assertEquals(false, Challenge.lastDig(15, 1, 1));
    }

    @Test
    public void test5() {
        assertEquals(false, Challenge.lastDig(123, 15, 10));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.lastDig(5213, 99219, 6165));
    }

    @Test
    public void test7() {
        assertEquals(false, Challenge.lastDig(1523, 513, 512));
    }

    @Test
    public void test8() {
        System.out.println("Should work with negative numbers.");
        assertEquals(false, Challenge.lastDig(-15, 1, 1));
    }

    @Test
    public void test9() {
        System.out.println("Should work with negative numbers.");
        assertEquals(false, Challenge.lastDig(123, -15, 10));
    }

    @Test
    public void test10() {
        System.out.println("Should work with negative numbers.");
        assertEquals(true, Challenge.lastDig(-12, 15, -10));
    }

    @Test
    public void test11() {
        System.out.println("Should work with negative numbers.");
        assertEquals(true, Challenge.lastDig(15228, -9209, -72162));
    }
}