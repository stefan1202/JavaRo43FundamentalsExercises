package ro.sda.javaro43.solo_w2.task52;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlueShadeTest {
    @Test
    public void test1() {
        assertEquals(0, BlueShade.howManyWalls(5, 4, 4));
    }

    @Test
    public void test2() {
        assertEquals(0, BlueShade.howManyWalls(4, 6, 6));
    }

    @Test
    public void test3() {
        assertEquals(5, BlueShade.howManyWalls(100, 4, 5));
    }

    @Test
    public void test4() {
        assertEquals(0, BlueShade.howManyWalls(10, 15, 12));
    }

    @Test
    public void test5() {
        assertEquals(2, BlueShade.howManyWalls(41, 3, 6));
    }

    @Test
    public void test6() {
        assertEquals(0, BlueShade.howManyWalls(50, 11, 5));
    }

    @Test
    public void test7() {
        assertEquals(1, BlueShade.howManyWalls(1, 1, 1));
    }

    @Test
    public void test8() {
        assertEquals(1, BlueShade.howManyWalls(54, 1, 43));
    }

    @Test
    public void test9() {
        assertEquals(2, BlueShade.howManyWalls(46, 5, 4));
    }
}
// Credit goes to the original author and publisher @Joshua Señoron