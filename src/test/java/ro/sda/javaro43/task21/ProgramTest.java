package ro.sda.javaro43.task21;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1() {
        assertEquals(3, Program.footballPoints(1, 0, 0));
    }
    @Test
    public void test2() {
        assertEquals(20, Program.footballPoints(5, 5, 5));
    }
    @Test
    public void test3() {
        assertEquals(5, Program.footballPoints(1, 2, 3));
    }
    @Test
    public void test4() {
        assertEquals(7, Program.footballPoints(0, 7, 0));
    }
    @Test
    public void test5() {
        assertEquals(0, Program.footballPoints(0, 0, 15));
    }
}