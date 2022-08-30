package ro.sda.javaro43.solo_w0.task1;

import org.junit.Test;
import ro.sda.javaro43.solo_w0.task1.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(360, Challenge.convert(6));
    }

    @Test
    public void test2() {
        assertEquals(240, Challenge.convert(4));
    }

    @Test
    public void test3() {
        assertEquals(480, Challenge.convert(8));
    }

    @Test
    public void test4() {
        assertEquals(3600, Challenge.convert(60));
    }
}