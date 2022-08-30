package ro.sda.javaro43.solo_w1.task26;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.reverse(false));
    }

    @Test
    public void test2() {
        assertEquals(false, Challenge.reverse(true));
    }
}