package ro.sda.javaro43.solo_w0.task7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ro.sda.javaro43.solo_w0.task7.Circuit;

public class CircuitTests {
    @Test
    public void test01() {
        assertEquals(Circuit.power(230, 10), 2300);
    }

    @Test
    public void test02() {
        assertEquals(Circuit.power(110, 3), 330);
    }

    @Test
    public void test03() {
        assertEquals(Circuit.power(480, 20), 9600);
    }
}