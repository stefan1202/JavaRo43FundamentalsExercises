package ro.sda.javaro43.solo_w4.task141;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(6, Challenge.matchHouses(1));
    }

    @Test
    public void test2() {
        assertEquals(0, Challenge.matchHouses(0));
    }

    @Test
    public void test3() {
        assertEquals(86, Challenge.matchHouses(17));
    }

    @Test
    public void test4() {
        assertEquals(181, Challenge.matchHouses(36));
    }

    @Test
    public void test5() {
        assertEquals(76, Challenge.matchHouses(15));
    }

    @Test
    public void test6() {
        assertEquals(496, Challenge.matchHouses(99));
    }

    @Test
    public void test7() {
        assertEquals(16, Challenge.matchHouses(3));
    }

    @Test
    public void test8() {
        assertEquals(436, Challenge.matchHouses(87));
    }
}