package ro.sda.javaro43.solo_w0.task23;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ro.sda.javaro43.solo_w0.task23.BasketballPoints;

public class BasketballPointsTest {
    @Test
    public void test01() {
        assertEquals(5, BasketballPoints.points(1, 1));
    }

    @Test
    public void test02() {
        assertEquals(29, BasketballPoints.points(7, 5));
    }

    @Test
    public void test03() {
        assertEquals(100, BasketballPoints.points(38, 8));
    }

    @Test
    public void test04() {
        assertEquals(22, BasketballPoints.points(5, 4));
    }

    @Test
    public void test05() {
        assertEquals(206, BasketballPoints.points(4, 66));
    }

    @Test
    public void test06() {
        assertEquals(8, BasketballPoints.points(1, 2));
    }

    @Test
    public void test07() {
        assertEquals(7, BasketballPoints.points(2, 1));
    }

    @Test
    public void test08() {
        assertEquals(10, BasketballPoints.points(2, 2));
    }

    @Test
    public void test09() {
        assertEquals(264, BasketballPoints.points(69, 42));
    }

    @Test
    public void test10() {
        assertEquals(70, BasketballPoints.points(17, 12));
    }

    @Test
    public void test11() {
        assertEquals(62, BasketballPoints.points(13, 12));
    }
}