package ro.sda.javaro43.solo_w3.task112;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task112.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("Edaaaaabit", Challenge.howManyTimes(5));
    }

    @Test
    public void test2() {
        assertEquals("Edaaaaaaaaaaaaaaabit", Challenge.howManyTimes(15));
    }

    @Test
    public void test3() {
        assertEquals("Edaaaaaaaaaabit", Challenge.howManyTimes(10));
    }

    @Test
    public void test4() {
        assertEquals("Edaaaaaaaaaaaaaaaaaaaaaaabit", Challenge.howManyTimes(23));
    }

    @Test
    public void test5() {
        assertEquals("Edabit", Challenge.howManyTimes(1));
    }
}