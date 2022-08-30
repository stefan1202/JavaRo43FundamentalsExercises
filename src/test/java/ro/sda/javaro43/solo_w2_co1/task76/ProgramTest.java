package ro.sda.javaro43.solo_w2_co1.task76;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        assertEquals(-76, Challenge.calculate(24,100, "-"));
    }

    @Test
    public void test2(){
        assertEquals(-50, Challenge.calculate(-20,-30, "+"));
    }

    @Test
    public void test3(){
        assertEquals(300, Challenge.calculate(1500,5, "/"));
    }

    @Test
    public void test4(){
        assertEquals(114, Challenge.calculate(38,3, "*"));
    }

    @Test
    public void test5(){
        assertEquals(4, Challenge.calculate(49,5, "%"));
    }
}