package ro.sda.javaro43.solo_w2_co1.task77;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.isLeap(2020));
    }

    @Test
    public void test2() {
        assertEquals(false, Challenge.isLeap(1800));
    }

    @Test
    public void test3() {
        assertEquals(true, Challenge.isLeap(2000));
    }

    @Test
    public void test4() {
        assertEquals(false, Challenge.isLeap(2019));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.isLeap(1452));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.isLeap(1998));
    }

    @Test
    public void test7() {
        assertEquals(true, Challenge.isLeap(1904));
    }

    @Test
    public void test8() {
        assertEquals(false, Challenge.isLeap(1985));
    }

    @Test
    public void test9() {
        assertEquals(true, Challenge.isLeap(2048));
    }

    @Test
    public void test10() {
        assertEquals(true, Challenge.isLeap(1600));
    }
}