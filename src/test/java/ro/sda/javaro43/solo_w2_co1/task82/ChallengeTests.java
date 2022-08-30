package ro.sda.javaro43.solo_w2_co1.task82;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(6, Challenge.addUpTo(3));
    }

    @Test
    public void test2() {
        assertEquals(55, Challenge.addUpTo(10));
    }

    @Test
    public void test3() {
        assertEquals(0, Challenge.addUpTo(0));
    }

    @Test
    public void test4() {
        assertEquals(3, Challenge.addUpTo(2));
    }

    @Test
    public void test5() {
        assertEquals(210, Challenge.addUpTo(20));
    }

    @Test
    public void test6() {
        assertEquals(1, Challenge.addUpTo(1));
    }
}

// made by @Joshua Señoron