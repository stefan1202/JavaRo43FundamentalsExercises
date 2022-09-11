package ro.sda.javaro43.solo_w3.task125;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task125.Program;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void test1(){
        assertEquals("Burrrp", Program.longBurp(3));
    }
    @Test
    public void test2(){
        assertEquals("Burrrrrrrrrp",  Program.longBurp(9));
    }
    @Test
    public void test3(){
        assertEquals("Burrrrrrrrrrp", Program.longBurp(10));
    }
    @Test
    public void test4(){
        assertEquals("Burrrrrrrrrrrrrp",  Program.longBurp(13));
    }
    @Test
    public void test5(){
        assertEquals("Burrrrrrrrrrrrrrrrrrp", Program.longBurp(18));
    }
    @Test
    public void test6(){
        assertEquals("Burp", Program.longBurp(1));
    }
}