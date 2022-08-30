package ro.sda.javaro43.solo_w2_co1.task73;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1() {
        System.out.println("5^5 should equal 3125");
        assertEquals(3125, Challenge.calculateExponent(5, 5));
    }

    @Test
    public void test2() {
        System.out.println("3^3 should equal 27");
        assertEquals(27, Challenge.calculateExponent(3, 3));
    }

    @Test
    public void test3() {
        System.out.println("2^3 should equal 8");
        assertEquals(8, Challenge.calculateExponent(2, 3));
    }
}