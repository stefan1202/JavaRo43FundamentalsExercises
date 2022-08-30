package ro.sda.javaro43.solo_w1.task46;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PerValueOrSumTest {
    @Test
    public void test01() {
        assertEquals(true, PerValueOrSum.makesTen(9, 10));
    }

    @Test
    public void test02() {
        assertEquals(false, PerValueOrSum.makesTen(9, 9));
    }

    @Test
    public void test03() {
        assertEquals(true, PerValueOrSum.makesTen(1, 9));
    }

    @Test
    public void test04() {
        assertEquals(true, PerValueOrSum.makesTen(10, 1));
    }

    @Test
    public void test05() {
        assertEquals(true, PerValueOrSum.makesTen(10, 10));
    }

    @Test
    public void test06() {
        assertEquals(true, PerValueOrSum.makesTen(8, 2));
    }

    @Test
    public void test07() {
        assertEquals(false, PerValueOrSum.makesTen(8, 3));
    }

    @Test
    public void test08() {
        assertEquals(true, PerValueOrSum.makesTen(10, 42));
    }

    @Test
    public void test09() {
        assertEquals(true, PerValueOrSum.makesTen(12,-2));
    }

    @Test
    public void test10() {
        assertEquals(true, PerValueOrSum.makesTen(3, 7));
    }
}