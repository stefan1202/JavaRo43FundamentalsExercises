package ro.sda.javaro43.solo_w3.task131;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task131.BaseNumberAge;

public class BaseNumberAgeTest {
    @Test
    public void test01() {
        assertEquals("Tesha is just 20, in base 16!", BaseNumberAge.happyBirthday(32));
    }

    @Test
    public void test02() {
        assertEquals("Tesha is just 21, in base 19!", BaseNumberAge.happyBirthday(39));
    }

    @Test
    public void test03() {
        assertEquals("Tesha is just 20, in base 11!", BaseNumberAge.happyBirthday(22));
    }

    @Test
    public void test04() {
        assertEquals("Tesha is just 21, in base 32!", BaseNumberAge.happyBirthday(65));
    }

    @Test
    public void test05() {
        assertEquals("Tesha is just 21, in base 41!", BaseNumberAge.happyBirthday(83));
    }

    @Test
    public void test06() {
        assertEquals("Tesha is just 21, in base 47!", BaseNumberAge.happyBirthday(95));
    }

    @Test
    public void test07() {
        assertEquals("Tesha is just 20, in base 50!", BaseNumberAge.happyBirthday(100));
    }

    @Test
    public void test08() {
        assertEquals("Tesha is just 20, in base 60!", BaseNumberAge.happyBirthday(120));
    }

    @Test
    public void test09() {
        assertEquals("Tesha is just 21, in base 10!", BaseNumberAge.happyBirthday(21));
    }

    @Test
    public void test10() {
        assertEquals("Tesha is just 21, in base 73!", BaseNumberAge.happyBirthday(147));
    }

    @Test
    public void test11() {
        assertEquals("Tesha is just 20, in base 27!", BaseNumberAge.happyBirthday(54));
    }

    @Test
    public void test12() {
        assertEquals("Tesha is just 20, in base 23!", BaseNumberAge.happyBirthday(46));
    }

    @Test
    public void test13() {
        assertEquals("Tesha is just 20, in base 33!", BaseNumberAge.happyBirthday(66));
    }
}