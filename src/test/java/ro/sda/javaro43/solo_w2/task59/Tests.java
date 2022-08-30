package ro.sda.javaro43.solo_w2.task59;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.both(6, 2));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.both(-6, -9));
    }

    @Test
    public void test3() {
        assertEquals(false, Challenge.both(6, -2));
    }

    @Test
    public void test4() {
        assertEquals(true, Challenge.both(0, 0));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.both(100, 1));
    }

    @Test
    public void test6() {
        assertEquals(true, Challenge.both(-0, 0));
    }

    @Test
    public void test7() {
        assertEquals(true, Challenge.both(-80, -5000));
    }

    @Test
    public void test8() {
        assertEquals(false, Challenge.both(6, -999));
    }

    @Test
    public void test9() {
        assertEquals(false, Challenge.both(-1, 2));
    }

    @Test
    public void test10() {
        assertEquals(false, Challenge.both(0, 2));
    }
}