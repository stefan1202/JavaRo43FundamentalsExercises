package ro.sda.javaro43.solo_w1.task43;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class PairsTest {
    @Test
    public void test01() {
        assertArrayEquals(new int[] {1,2}, Pairs.makePair(1, 2));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[] {15,35}, Pairs.makePair(15, 35));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[] {20,40}, Pairs.makePair(20, 40));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[] {51,21}, Pairs.makePair(51, 21));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[] {512124,215}, Pairs.makePair(512124, 215));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[] {34345435,678}, Pairs.makePair(34345435, 678));
    }
}