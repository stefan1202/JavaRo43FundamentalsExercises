package ro.sda.javaro43.Task12;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1() {
        assertEquals("something a", Program.giveMeSomething("a"));
    }
    @Test
    public void test2() {
        assertEquals("something is cooking", Program.giveMeSomething("is cooking"));
    }
    @Test
    public void test3() {
        assertEquals("something  is cooking", Program.giveMeSomething(" is cooking"));
    }
}