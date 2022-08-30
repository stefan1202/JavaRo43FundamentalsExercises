package ro.sda.javaro43.solo_w1.task28;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void test1(){
        assertEquals(true, Program.and(true, true));
    }
    @Test
    public void test2(){
        assertEquals(false, Program.and(true, false));
    }
    @Test
    public void test3(){
        assertEquals(false, Program.and(false, true));
    }
    @Test
    public void test4(){
        assertEquals(false, Program.and(false, false));
    }


}