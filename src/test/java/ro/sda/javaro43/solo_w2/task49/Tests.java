package ro.sda.javaro43.solo_w2.task49;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.task49.Program;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1() {
        assertEquals(Program.acceptIntoMovie(14, true), true);
    }

    @Test
    public void test2() {
        assertEquals(Program.acceptIntoMovie(15, true), true);
    }

    @Test
    public void test3() {
        assertEquals(Program.acceptIntoMovie(16, true), true);
    }

    @Test
    public void test4() {
        assertEquals(Program.acceptIntoMovie(14, false), false);
    }

    @Test
    public void test5() {
        assertEquals(Program.acceptIntoMovie(15, false), true);
    }

    @Test
    public void test6() {
        assertEquals(Program.acceptIntoMovie(16, false), true);
    }
}