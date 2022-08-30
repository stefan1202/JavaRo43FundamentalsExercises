package ro.sda.javaro43.solo_w2_co1.task79;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(729, Challenge.cubeSquareRoot(81));
    }

    @Test
    public void test2() {
        assertEquals(2111932187, Challenge.cubeSquareRoot(1646089));
    }

    @Test
    public void test3() {
        assertEquals(580093704, Challenge.cubeSquareRoot(695556));
    }
}