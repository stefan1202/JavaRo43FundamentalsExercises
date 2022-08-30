package ro.sda.javaro43.solo_w2.task60;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1() {
        assertEquals(32, Challenge.ctoa(' '));
    }

    @Test
    public void test2() {
        assertEquals(65, Challenge.ctoa('A'));
    }

    @Test
    public void test3() {
        assertEquals(93, Challenge.ctoa(']'));
    }

    @Test
    public void test4() {
        assertEquals(94, Challenge.ctoa('^'));
    }

    @Test
    public void test5() {
        assertEquals(99, Challenge.ctoa('c'));
    }
}