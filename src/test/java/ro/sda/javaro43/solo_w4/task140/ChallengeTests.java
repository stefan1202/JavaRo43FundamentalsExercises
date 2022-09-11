package ro.sda.javaro43.solo_w4.task140;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(5, Challenge.hammingDistance("abcde", "bcdef"));
    }

    @Test
    public void test2() {
        assertEquals(0, Challenge.hammingDistance("abcde", "abcde"));
    }

    @Test
    public void test3() {
        assertEquals(1, Challenge.hammingDistance("strong", "strung"));
    }
}