package ro.sda.javaro43.solo_w1.task33;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        assertEquals("Hello, Matt!", Program.greeting("Matt"));
    }
    @Test
    public void test2(){
        assertEquals("Hello, Helen!", Program.greeting("Helen"));
    }
    @Test
    public void test3(){
        assertEquals("Hello, my Love!", Program.greeting("Mubashir"));
    }
}