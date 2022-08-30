package ro.sda.javaro43.solo_w2.task63;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.isPlural("dudes"));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.isPlural("flowers"));
    }

    @Test
    public void test3() {
        assertEquals(true, Challenge.isPlural("checks"));
    }

    @Test
    public void test4() {
        assertEquals(true, Challenge.isPlural("varies"));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.isPlural("efforts"));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.isPlural("mood"));
    }

    @Test
    public void test7() {
        assertEquals(false, Challenge.isPlural("whiteboard"));
    }

    @Test
    public void test8() {
        assertEquals(false, Challenge.isPlural("cow"));
    }

    @Test
    public void test9() {
        assertEquals(false, Challenge.isPlural("word"));
    }

    @Test
    public void test10() {
        assertEquals(false, Challenge.isPlural("love"));
    }

    @Test
    public void test11() {
        assertEquals(false, Challenge.isPlural("silly"));
    }
}