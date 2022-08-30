package ro.sda.javaro43.solo_w2_co2.task106;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        System.out.println("Should work with one digit.");
        assertEquals(1, Challenge.findDigitAmount(1));
    }

    @Test
    public void test2() {
        System.out.println("Should work with a two-digit number.");
        assertEquals(2, Challenge.findDigitAmount(67));
    }

    @Test
    public void test3() {
        System.out.println("Should work with a three-digit number.");
        assertEquals(3, Challenge.findDigitAmount(123));
    }

    @Test
    public void test4() {
        System.out.println("Should work with a bit bigger number.");
        assertEquals(5, Challenge.findDigitAmount(55551));
    }

    @Test
    public void test5() {
        System.out.println("Should work with bigger numbers.");
        assertEquals(8, Challenge.findDigitAmount(96456431));
    }

    @Test
    public void test6() {
        System.out.println("0 should return 1, as it is a digit.");
        assertEquals(1, Challenge.findDigitAmount(0));
    }
}