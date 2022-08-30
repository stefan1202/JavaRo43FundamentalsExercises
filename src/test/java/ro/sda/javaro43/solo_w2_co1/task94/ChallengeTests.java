package ro.sda.javaro43.solo_w2_co1.task94;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.match("hello", "hELLo"));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.match("hey", "hey"));
    }

    @Test
    public void test3() {
        assertEquals(true, Challenge.match("venom", "VENOM"));
    }

    @Test
    public void test4() {
        assertEquals(true, Challenge.match("maGIciAN", "magician"));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.match("stupIFy", "stupifY"));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.match("bald", "blad"));
    }

    @Test
    public void test7() {
        assertEquals(false, Challenge.match("motive", "emotive"));
    }

    @Test
    public void test8() {
        assertEquals(false, Challenge.match("mask", "mAskinG"));
    }

    @Test
    public void test9() {
        assertEquals(false, Challenge.match("skim", "skimp"));
    }

    @Test
    public void test10() {
        assertEquals(false, Challenge.match("EXCEl", "exceLs"));
    }
}