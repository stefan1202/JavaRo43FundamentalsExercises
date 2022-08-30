package ro.sda.javaro43.solo_w0.task16;

import org.junit.Test;
import ro.sda.javaro43.solo_w0.task16.InchesToFeet;

import static org.junit.Assert.assertEquals;

public class InchesToFeetTest {
    @Test
    public void test1(){
        assertEquals(1, InchesToFeet.convert(12));
    }

    @Test
    public void test2(){
        assertEquals(30, InchesToFeet.convert(360));
    }

    @Test
    public void test3(){
        assertEquals(301, InchesToFeet.convert(3612));
    }

    @Test
    public void test4(){
        assertEquals(27, InchesToFeet.convert(324));
    }

    @Test
    public void test5(){
        assertEquals(251, InchesToFeet.convert(3012));
    }

    @Test
    public void test6(){
        assertEquals(0, InchesToFeet.convert(11));
    }
}