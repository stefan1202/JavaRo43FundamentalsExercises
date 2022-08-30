package ro.sda.javaro43.solo_w2.task50;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerInRangeTests {
    @Test
    public void test1() {
        assertEquals(true, IntegerInRange.intWithinBounds(4, 1, 9));
    }

    @Test
    public void test2() {
        assertEquals(false, IntegerInRange.intWithinBounds(3, 1, -7));
    }

    @Test
    public void test3() {
        assertEquals(false, IntegerInRange.intWithinBounds(-32, -21, 49));
    }

    @Test
    public void test4() {
        assertEquals(false, IntegerInRange.intWithinBounds(38, 39, -2));
    }

    @Test
    public void test5() {
        assertEquals(true, IntegerInRange.intWithinBounds(46, -39, 82));
    }

    @Test
    public void test6() {
        assertEquals(true, IntegerInRange.intWithinBounds(2, 1, 3));
    }

    @Test
    public void test7() {
        assertEquals(true, IntegerInRange.intWithinBounds(-3, -5, -2));
    }

    @Test
    public void test8() {
        assertEquals(false, IntegerInRange.intWithinBounds(-3, -5, -3));
    }

    @Test
    public void test9() {
        assertEquals(true, IntegerInRange.intWithinBounds(-3, -10, 10));
    }

    @Test
    public void test10() {
        assertEquals(true, IntegerInRange.intWithinBounds(0, -3, 3));
    }

    @Test
    public void test11() {
        assertEquals(true, IntegerInRange.intWithinBounds(0, 0, 1));
    }

    @Test
    public void test12() {
        assertEquals(true, IntegerInRange.intWithinBounds(7, 7, 12));
    }
}