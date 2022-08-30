package ro.sda.javaro43.solo_w1.task39;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumericTest {

    @Test
    public void test01() {
        assertEquals(-5, Numeric.returnNegative(-5));
    }

    @Test
    public void test02() {
        assertEquals(-54, Numeric.returnNegative(54));
    }

    @Test
    public void test03() {
        assertEquals(-46, Numeric.returnNegative(46));
    }

    @Test
    public void test04() {
        assertEquals(-4, Numeric.returnNegative(-4));
    }

    @Test
    public void test05() {
        assertEquals(-15, Numeric.returnNegative(15));
    }

    @Test
    public void test06() {
        assertEquals(-466, Numeric.returnNegative(466));
    }

    @Test
    public void test07() {
        assertEquals(-544, Numeric.returnNegative(544));
    }

    @Test
    public void test08() {
        assertEquals(0, Numeric.returnNegative(0));
    }

    @Test
    public void test09() {
        assertEquals(-666, Numeric.returnNegative(-666));
    }

    @Test
    public void test10() {
        assertEquals(-12, Numeric.returnNegative(-12));
    }

    @Test
    public void test11() {
        assertEquals(-13, Numeric.returnNegative(13));
    }

    @Test
    public void test12() {
        assertEquals(-17, Numeric.returnNegative(17));
    }

}
// end of tests