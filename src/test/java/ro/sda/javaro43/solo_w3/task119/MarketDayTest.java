package ro.sda.javaro43.solo_w3.task119;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task119.MarketDay;

public class MarketDayTest {
    @Test
    public void test01() {
        assertEquals("Bill", MarketDay.whoWinsTonight(20, 20, 5, 10));
    }

    @Test
    public void test02() {
        assertEquals("Bill", MarketDay.whoWinsTonight(30, 100, 1, 50));
    }

    @Test
    public void test03() {
        assertEquals("Bill", MarketDay.whoWinsTonight(90, 10, 2, 5));
    }

    @Test
    public void test04() {
        assertEquals("Will", MarketDay.whoWinsTonight(10, 2, 20, 1));
    }

    @Test
    public void test05() {
        assertEquals("Will", MarketDay.whoWinsTonight(40, 100, 5, 10));
    }

    @Test
    public void test06() {
        assertEquals("Will", MarketDay.whoWinsTonight(5, 5, 5, 2));
    }

    @Test
    public void test07() {
        assertEquals("Tie", MarketDay.whoWinsTonight(3, 7, 2, 5));
    }

    @Test
    public void test08() {
        assertEquals("Tie", MarketDay.whoWinsTonight(50, 50, 49, 26));
    }

    @Test
    public void test09() {
        assertEquals("Tie", MarketDay.whoWinsTonight(100000, 100000, 1, 1));
    }
}
// credit goes to the original author/publisher @Joshua Señoron