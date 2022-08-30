package ro.sda.javaro43.solo_w1.task38;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void test1(){
        assertEquals("odd", Program.isEvenOrOdd(3));
    }
    @Test
    public void test2(){
        assertEquals("even", Program.isEvenOrOdd(0));
    }
    @Test
    public void test3(){
        assertEquals("odd", Program.isEvenOrOdd(7));
    }
    @Test
    public void test4(){
        assertEquals("even", Program.isEvenOrOdd(12));
    }
    @Test
    public void test5(){
        assertEquals("even", Program.isEvenOrOdd(6474));
    }
    @Test
    public void test6(){
        assertEquals("odd", Program.isEvenOrOdd(563));
    }
    @Test
    public void test7(){
        assertEquals("odd", Program.isEvenOrOdd(3));
    }
    @Test
    public void test8(){
        assertEquals("odd", Program.isEvenOrOdd(-3));
    }
    @Test
    public void test9(){
        assertEquals("even", Program.isEvenOrOdd(-6));
    }
    @Test
    public void test10(){
        assertEquals("even", Program.isEvenOrOdd(11111000));
    }
    @Test
    public void test11(){
        assertEquals("even", Program.isEvenOrOdd(-0));
    }
    @Test
    public void test12(){
        assertEquals("odd", Program.isEvenOrOdd(-301));
    }
}