package ro.sda.javaro43.solo_w4.task137;

import org.junit.Test;
import ro.sda.javaro43.solo_w4.task137.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(50, Challenge.squareAreasDifference(5));
    }

    @Test
    public void test2() {
        assertEquals(72, Challenge.squareAreasDifference(6));
    }

    @Test
    public void test3() {
        assertEquals(98, Challenge.squareAreasDifference(7));
    }

    @Test
    public void test4() {
        assertEquals(578, Challenge.squareAreasDifference(17));
    }
}