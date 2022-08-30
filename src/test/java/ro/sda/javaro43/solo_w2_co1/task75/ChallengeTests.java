package ro.sda.javaro43.solo_w2_co1.task75;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("Hello", Challenge.helloWorld(3));
    }

    @Test
    public void test2() {
        assertEquals("World", Challenge.helloWorld(5));
    }

    @Test
    public void test3() {
        assertEquals("Hello World", Challenge.helloWorld(15));
    }
}