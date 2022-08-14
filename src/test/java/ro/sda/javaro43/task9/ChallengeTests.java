package ro.sda.javaro43.task9;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(3, Challenge.triArea(3, 2));
    }

    @Test
    public void test2() {
        assertEquals(10, Challenge.triArea(5, 4));
    }

    @Test
    public void test3() {
        assertEquals(50, Challenge.triArea(10, 10));
    }

    @Test
    public void test4() {
        assertEquals(0, Challenge.triArea(0, 60));
    }

    @Test
    public void test5() {
        assertEquals(66, Challenge.triArea(12, 11));
    }
}