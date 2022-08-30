package ro.sda.javaro43.solo_w2.task68;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.kToK(4, 2));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.kToK(387420489, 9));
    }

    @Test
    public void test3() {
        assertEquals(false, Challenge.kToK(582241841, 13));
    }

    @Test
    public void test4() {
        assertEquals(false, Challenge.kToK(3124, 5));
    }

    @Test
    public void test5() {
        assertEquals(false, Challenge.kToK(17, 3));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.kToK(823544, 7));
    }
}