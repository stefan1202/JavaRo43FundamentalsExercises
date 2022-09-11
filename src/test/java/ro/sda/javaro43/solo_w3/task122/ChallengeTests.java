package ro.sda.javaro43.solo_w3.task122;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task122.Program;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(120, Program.factorial(5));
    }

    @Test
    public void test2() {
        assertEquals(6, Program.factorial(3));
    }

    @Test
    public void test3() {
        assertEquals(1, Program.factorial(1));
    }

    @Test
    public void test4() {
        assertEquals(1, Program.factorial(0));
    }
}