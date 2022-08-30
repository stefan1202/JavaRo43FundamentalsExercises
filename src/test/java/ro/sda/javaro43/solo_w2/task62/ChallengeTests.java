package ro.sda.javaro43.solo_w2.task62;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(7, Challenge.totalCups(6));
    }

    @Test
    public void test2() {
        assertEquals(3, Challenge.totalCups(3));
    }

    @Test
    public void test3() {
        assertEquals(8, Challenge.totalCups(7));
    }

    @Test
    public void test4() {
        assertEquals(14, Challenge.totalCups(12));
    }

    @Test
    public void test5() {
        assertEquals(248, Challenge.totalCups(213));
    }

    @Test
    public void test6() {
        assertEquals(18, Challenge.totalCups(16));
    }
}