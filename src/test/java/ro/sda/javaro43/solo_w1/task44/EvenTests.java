package ro.sda.javaro43.solo_w1.task44;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EvenTests {
    @Test
    public void test01() {
        assertEquals(Nth.even(1), 0);
    }

    @Test
    public void test02() {
        assertEquals(Nth.even(2), 2);
    }

    @Test
    public void test03() {
        assertEquals(Nth.even(3), 4);
    }
    @Test
    public void test04() {
        assertEquals(Nth.even(100), 198);
    }
    @Test
    public void test05() {
        assertEquals(Nth.even(1298734), 2597466);
    }
}