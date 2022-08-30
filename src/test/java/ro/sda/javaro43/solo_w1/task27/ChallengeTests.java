package ro.sda.javaro43.solo_w1.task27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(1, Program.flipIntBool(0));
    }

    @Test
    public void test2() {
        assertEquals(0, Program.flipIntBool(1));
    }
}