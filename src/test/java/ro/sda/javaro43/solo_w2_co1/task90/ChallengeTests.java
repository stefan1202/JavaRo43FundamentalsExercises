package ro.sda.javaro43.solo_w2_co1.task90;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(Challenge.starNumber(2),13);
    }

    @Test
    public void test2() {
        assertEquals(Challenge.starNumber(3),37);
    }

    @Test
    public void test3() {
        assertEquals(Challenge.starNumber(6),181);
    }

    @Test
    public void test4() {
        assertEquals(Challenge.starNumber(6),181);
    }

    @Test
    public void test5() {
        assertEquals(Challenge.starNumber(8),337);
    }

    @Test
    public void test6() {
        assertEquals(Challenge.starNumber(6),181);
    }

    @Test
    public void test7() {
        assertEquals(Challenge.starNumber(11),661);
    }
}