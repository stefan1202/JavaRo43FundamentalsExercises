package ro.sda.javaro43.solo_w1.task40;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FuelUpTest {
    @Test
    public void test01() {
        assertEquals(150, FuelUp.calculateFuel(15), 5);
    }

    @Test
    public void test02() {
        assertEquals(230, FuelUp.calculateFuel(23), 5);
    }

    @Test
    public void test03() {
        assertEquals(100, FuelUp.calculateFuel(10), 5);
    }

    @Test
    public void test04() {
        assertEquals(100, FuelUp.calculateFuel(3), 5);
    }

    @Test
    public void test05() {
        assertEquals(235, FuelUp.calculateFuel(23.5), 5);
    }

    @Test
    public void test06() {
        assertEquals(100, FuelUp.calculateFuel(3.14), 5);
    }

    @Test
    public void test07() {
        assertEquals(100, FuelUp.calculateFuel(9.99999), 5);
    }

    @Test
    public void test08() {
        assertEquals(8223153220D, FuelUp.calculateFuel(822315322), 5);
    }

    @Test
    public void test09() {
        assertEquals(123456.789, FuelUp.calculateFuel(12345.6789), 5);
    }

    @Test
    public void test10() {
        assertEquals(314.1, FuelUp.calculateFuel(31.41), 5);
    }

    @Test
    public void test11() {
        assertEquals(540, FuelUp.calculateFuel(54), 5);
    }

    @Test
    public void test12() {
        assertEquals(466, FuelUp.calculateFuel(46.6), 5);
    }
}
// credit goes to original author/publisher @Joshua Señoron