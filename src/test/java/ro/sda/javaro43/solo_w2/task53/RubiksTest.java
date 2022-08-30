package ro.sda.javaro43.solo_w2.task53;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RubiksTest {
    @Test
    public void test01() {
        assertEquals(6, Rubiks.howManyStickers(1));
    }

    @Test
    public void test02() {
        assertEquals(24, Rubiks.howManyStickers(2));
    }

    @Test
    public void test03() {
        assertEquals(54, Rubiks.howManyStickers(3));
    }

    @Test
    public void test04() {
        assertEquals(96, Rubiks.howManyStickers(4));
    }

    @Test
    public void test05() {
        assertEquals(150, Rubiks.howManyStickers(5));
    }

    @Test
    public void test06() {
        assertEquals(216, Rubiks.howManyStickers(6));
    }

    @Test
    public void test07() {
        assertEquals(294, Rubiks.howManyStickers(7));
    }

    @Test
    public void test08() {
        assertEquals(384, Rubiks.howManyStickers(8));
    }

    @Test
    public void test09() {
        assertEquals(486, Rubiks.howManyStickers(9));
    }

    @Test
    public void test10() {
        assertEquals(600, Rubiks.howManyStickers(10));
    }

    @Test
    public void test11() {
        assertEquals(726, Rubiks.howManyStickers(11));
    }

    @Test
    public void test12() {
        assertEquals(864, Rubiks.howManyStickers(12));
    }

    @Test
    public void test13() {
        assertEquals(1014, Rubiks.howManyStickers(13));
    }

    @Test
    public void test14() {
        assertEquals(1176, Rubiks.howManyStickers(14));
    }

    @Test
    public void test15() {
        assertEquals(1350, Rubiks.howManyStickers(15));
    }
}