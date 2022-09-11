package ro.sda.javaro43.solo_w3.task135;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task135.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(5050, Challenge.sumEvenNumsInRange(51, 150));
    }

    @Test
    public void test2() {
        assertEquals(1360, Challenge.sumEvenNumsInRange(70, 100));
    }

    @Test
    public void test3() {
        assertEquals(630, Challenge.sumEvenNumsInRange(99, 110));
    }

    @Test
    public void test4() {
        assertEquals(1360, Challenge.sumEvenNumsInRange(63, 97));
    }

    @Test
    public void test5() {
        assertEquals(90, Challenge.sumEvenNumsInRange(10, 20));
    }
}