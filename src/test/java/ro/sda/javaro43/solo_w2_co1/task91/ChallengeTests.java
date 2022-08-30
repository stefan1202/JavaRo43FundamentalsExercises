package ro.sda.javaro43.solo_w2_co1.task91;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("obtuse", Challenge.missingAngle(27, 59));
    }

    @Test
    public void test2() {
        assertEquals("acute", Challenge.missingAngle(135, 11));
    }

    @Test
    public void test3() {
        assertEquals("right", Challenge.missingAngle(45, 45));
    }

    @Test
    public void test4() {
        assertEquals("obtuse", Challenge.missingAngle(45, 15));
    }

    @Test
    public void test5() {
        assertEquals("acute", Challenge.missingAngle(31, 100));
    }

    @Test
    public void test6() {
        assertEquals("right", Challenge.missingAngle(35, 55));
    }
}