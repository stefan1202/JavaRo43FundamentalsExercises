package ro.sda.javaro43.solo_w2_co1.task78;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(37, StringNumber.toInt("37"));
    }

    @Test
    public void test2() {
        assertEquals(113, StringNumber.toInt("113"));
    }

    @Test
    public void test3() {
        assertEquals(5, StringNumber.toInt("5"));
    }

    @Test
    public void test4() {
        assertEquals(5231, StringNumber.toInt("5231"));
    }

    @Test
    public void test5() {
        assertNotEquals("5231", StringNumber.toInt("5231"));
    }

    @Test
    public void test6() {
        assertEquals("37", StringNumber.toStr(37));
    }

    @Test
    public void test7() {
        assertEquals("113", StringNumber.toStr(113));
    }

    @Test
    public void test8() {
        assertEquals("5", StringNumber.toStr(5));
    }

    @Test
    public void test9() {
        assertEquals("5231", StringNumber.toStr(5231));
    }

    @Test
    public void test10() {
        assertNotEquals(5231, StringNumber.toStr(5231));
    }
}