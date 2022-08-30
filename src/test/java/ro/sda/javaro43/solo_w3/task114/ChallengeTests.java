package ro.sda.javaro43.solo_w3.task114;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(10, Program.addUp(4));
    }

    @Test
    public void test2() {
        assertEquals(91, Program.addUp(13));
    }

    @Test
    public void test3() {
        assertEquals(180300, Program.addUp(600));
    }

    @Test
    public void test4() {
        assertEquals(77028, Program.addUp(392));
    }

    @Test
    public void test5() {
        assertEquals(1431, Program.addUp(53));
    }

    @Test
    public void test6() {
        assertEquals(402753, Program.addUp(897));
    }

    @Test
    public void test7() {
        assertEquals(276, Program.addUp(23));
    }

    @Test
    public void test8() {
        assertEquals(500500, Program.addUp(1000));
    }

    @Test
    public void test9() {
        assertEquals(272691, Program.addUp(738));
    }

    @Test
    public void test10() {
        assertEquals(5050, Program.addUp(100));
    }

    @Test
    public void test11() {
        assertEquals(428275, Program.addUp(925));
    }

    @Test
    public void test12() {
        assertEquals(1, Program.addUp(1));
    }

    @Test
    public void test13() {
        assertEquals(499500, Program.addUp(999));
    }

    @Test
    public void test14() {
        assertEquals(15400, Program.addUp(175));
    }

    @Test
    public void test15() {
        assertEquals(6216, Program.addUp(111));
    }
}