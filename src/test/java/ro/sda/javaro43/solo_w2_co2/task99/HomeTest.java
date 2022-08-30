package ro.sda.javaro43.solo_w2_co2.task99;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HomeTest {

    @Test
    public void test01() {
        assertEquals(13, Home.distanceHome(new int[] {2, 4, 2, 5}));
    }

    @Test
    public void test02() {
        assertEquals(10, Home.distanceHome(new int[] {-1, -4, -3, -2}));
    }

    @Test
    public void test03() {
        assertEquals(0, Home.distanceHome(new int[] {3, 4, -5, -2}));
    }

    @Test
    public void test04() {
        assertEquals(24, Home.distanceHome(new int[] {12, 12}));
    }

    @Test
    public void test05() {
        assertEquals(10, Home.distanceHome(new int[] {10, 8, -4, -10, -15, 14, -13}));
    }

    @Test
    public void test06() {
        assertEquals(61, Home.distanceHome(new int[] {-3, -6, -15, -14, -11, 3, 0, -15, 0}));
    }

    @Test
    public void test07() {
        assertEquals(12, Home.distanceHome(new int[] {-11, -4, -14, 4, -2, 7, 0, -1, 10, -1}));
    }

    @Test
    public void test08() {
        assertEquals(15, Home.distanceHome(new int[] {-7, 1, 0, -9, 0, 0}));
    }

    @Test
    public void test09() {
        assertEquals(29, Home.distanceHome(new int[] {-15, -7, 4, -3, -8}));
    }

    @Test
    public void test10() {
        assertEquals(2, Home.distanceHome(new int[] {-11, 10, -6, 8, 0, 12, -11}));
    }

    @Test
    public void test11() {
        assertEquals(36, Home.distanceHome(new int[] {-4, -5, -14, -13}));
    }

    @Test
    public void test12() {
        assertEquals(13, Home.distanceHome(new int[] {5, 8}));
    }

    @Test
    public void test13() {
        assertEquals(5, Home.distanceHome(new int[] {10, -15, -3, 2, 4, -15, 11, 1}));
    }

    @Test
    public void test14() {
        assertEquals(10, Home.distanceHome(new int[] {9, 13, -11, -11, -10, -12, 15, -3}));
    }

    @Test
    public void test15() {
        assertEquals(24, Home.distanceHome(new int[] {13, -1, -12, -4, 0, 10, 8, 10}));
    }

    @Test
    public void test16() {
        assertEquals(21, Home.distanceHome(new int[] {-9, 1, -10, 10, -9, -10, 0, 11, -2, -3}));
    }

    @Test
    public void test17() {
        assertEquals(57, Home.distanceHome(new int[] {13, 2, 12, 12, -15, 11, 9, 0, 13}));
    }

    @Test
    public void test18() {
        assertEquals(10, Home.distanceHome(new int[] {0, 5, 8, -3}));
    }

    @Test
    public void test19() {
        assertEquals(21, Home.distanceHome(new int[] {-10, 2, -1, -12}));
    }

    @Test
    public void test20() {
        assertEquals(32, Home.distanceHome(new int[] {-9, -11, 11, -15, -8}));
    }

}
// end of tests