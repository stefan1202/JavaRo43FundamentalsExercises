package ro.sda.javaro43.solo_w3.task127;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task127.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("21", Challenge.smallerNum("21", "44"));
    }

    @Test
    public void test2() {
        assertEquals("153", Challenge.smallerNum("153", "367"));
    }

    @Test
    public void test3() {
        assertEquals("16", Challenge.smallerNum("1500", "16"));
    }

    @Test
    public void test4() {
        assertEquals("23", Challenge.smallerNum("100", "23"));
    }

    @Test
    public void test5() {
        assertEquals("1", Challenge.smallerNum("1500", "1"));
    }

    @Test
    public void test6() {
        assertEquals("5", Challenge.smallerNum("5", "5"));
    }
}