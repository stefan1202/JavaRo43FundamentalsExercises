package ro.sda.javaro43.solo_w1.task45;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoxTests {
    @Test
    public void test01() {
        assertEquals(Box.volumeOfBox(new int[] {1, 2, 3}), 6);
    }

    @Test
    public void test02() {
        assertEquals(Box.volumeOfBox(new int[] {2, 5, 6}), 60);
    }

    @Test
    public void test03() {
        assertEquals(Box.volumeOfBox(new int[] {1, 1, 1}), 1);
    }

    @Test
    public void test04() {
        assertEquals(Box.volumeOfBox(new int[] {2, 5, 1}), 10);
    }

    @Test
    public void test05() {
        assertEquals(Box.volumeOfBox(new int[] {4, 2, 2}), 16);
    }
}