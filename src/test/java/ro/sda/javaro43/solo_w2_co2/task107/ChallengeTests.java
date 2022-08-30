package ro.sda.javaro43.solo_w2_co2.task107;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.hurdleJump(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void test2() {
        assertEquals(false, Challenge.hurdleJump(new int[]{5, 5, 3, 4, 5}, 3));
    }

    @Test
    public void test3() {
        assertEquals(true, Challenge.hurdleJump(new int[]{5, 4, 5, 6}, 10));
    }

    @Test
    public void test4() {
        assertEquals(false, Challenge.hurdleJump(new int[]{1,2,1}, 1));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.hurdleJump(new int[]{3,3,3}, 4));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.hurdleJump(new int[]{4,4}, 3));
    }

    @Test
    public void test7() {
        assertEquals(true, Challenge.hurdleJump(new int[]{}, 4));
    }
}