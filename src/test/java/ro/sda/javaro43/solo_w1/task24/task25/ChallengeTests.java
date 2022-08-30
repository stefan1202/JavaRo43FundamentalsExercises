package ro.sda.javaro43.solo_w1.task24.task25;

import org.junit.Assert;
import org.junit.Test;
import ro.sda.javaro43.solo_w1.task25.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        Assert.assertEquals(3600, Challenge.convert(1, 0));
    }

    @Test
    public void test2() {
        assertEquals(3780, Challenge.convert(1, 3));
    }

    @Test
    public void test3() {
        assertEquals(1800, Challenge.convert(0, 30));
    }
}