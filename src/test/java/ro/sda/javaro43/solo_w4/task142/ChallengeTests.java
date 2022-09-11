package ro.sda.javaro43.solo_w4.task142;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(5040, Challenge.factorial(7));
    }

    @Test
    public void test2() {
        assertEquals(1, Challenge.factorial(1));
    }

    @Test
    public void test3() {
        assertEquals(362880, Challenge.factorial(9));
    }

    @Test
    public void test4() {
        assertEquals(2, Challenge.factorial(2));
    }
}