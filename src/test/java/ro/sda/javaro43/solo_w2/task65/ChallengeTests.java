package ro.sda.javaro43.solo_w2.task65;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("added", Challenge.operation(12, 12));
    }

    @Test
    public void test2() {
        assertEquals("subtracted", Challenge.operation(100, 76));
    }

    @Test
    public void test3() {
        assertEquals("multiplied", Challenge.operation(6, 4));
    }

    @Test
    public void test4() {
        assertEquals("divided", Challenge.operation(528, 22));
    }

    @Test
    public void test5() {
        assertEquals("none", Challenge.operation(10, 12));
    }
}