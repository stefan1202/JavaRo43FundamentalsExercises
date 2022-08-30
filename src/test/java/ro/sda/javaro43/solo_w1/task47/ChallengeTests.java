package ro.sda.javaro43.solo_w1.task47;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(1, Challenge.stackBoxes(1));
    }

    @Test
    public void test2() {
        assertEquals(4, Challenge.stackBoxes(2));
    }

    @Test
    public void test3() {
        assertEquals(0, Challenge.stackBoxes(0));
    }

    @Test
    public void test4() {
        assertEquals(25, Challenge.stackBoxes(5));
    }

    @Test
    public void test5() {
        assertEquals(729, Challenge.stackBoxes(27));
    }

    @Test
    public void test6() {
        assertEquals(38416, Challenge.stackBoxes(196));
    }

    @Test
    public void test7() {
        assertEquals(262144, Challenge.stackBoxes(512));
    }
}