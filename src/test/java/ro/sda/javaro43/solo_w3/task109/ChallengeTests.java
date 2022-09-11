package ro.sda.javaro43.solo_w3.task109;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task109.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("-", Challenge.Go(1));
    }

    @Test
    public void test2() {
        assertEquals("--", Challenge.Go(2));
    }

    @Test
    public void test3() {
        assertEquals("-------", Challenge.Go(7));
    }

    @Test
    public void test4() {
        assertEquals("--------", Challenge.Go(8));
    }

    @Test
    public void test5() {
        assertEquals("----------", Challenge.Go(10));
    }

    @Test
    public void test6() {
        assertEquals("-----------", Challenge.Go(11));
    }

    @Test
    public void test7() {
        assertEquals("------------", Challenge.Go(12));
    }

    @Test
    public void test8() {
        assertEquals("-------------------------------", Challenge.Go(31));
    }

    @Test
    public void test9() {
        assertEquals("------------------------------------------------------", Challenge.Go(54));
    }
}