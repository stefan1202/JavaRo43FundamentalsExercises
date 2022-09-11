package ro.sda.javaro43.solo_w3.task134;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task134.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("20191211", Challenge.formatDate("11/12/2019"));
    }

    @Test
    public void test2() {
        assertEquals("20193112", Challenge.formatDate("12/31/2019"));
    }

    @Test
    public void test3() {
        assertEquals("20191501", Challenge.formatDate("01/15/2019"));
    }
}