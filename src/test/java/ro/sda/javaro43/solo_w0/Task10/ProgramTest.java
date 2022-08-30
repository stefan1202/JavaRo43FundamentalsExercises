package ro.sda.javaro43.solo_w0.Task10;

import org.junit.Test;
import ro.sda.javaro43.solo_w0.Task10.Program;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void test1(){
        assertEquals(false, Program.lessThanOrEqualToZero(5));
    }

    @Test
    public void test2(){
        assertEquals(true, Program.lessThanOrEqualToZero(0));
    }

    @Test
    public void test3(){
        assertEquals(true, Program.lessThanOrEqualToZero(-5));
    }

    @Test
    public void test4(){
        assertEquals(false, Program.lessThanOrEqualToZero(1));
    }

    @Test
    public void test5(){
        assertEquals(false, Program.lessThanOrEqualToZero(2));
    }

    @Test
    public void test6(){
        assertEquals(false, Program.lessThanOrEqualToZero(10000));
    }
}