package ro.sda.javaro43.solo_w4.task143;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        assertEquals(false, Program.checkEquality(new Integer(1), new Boolean(true)));
    }

    @Test
    public void test2(){
        assertEquals(false, Program.checkEquality(new Integer(0), "0"));
    }

    @Test
    public void test3(){
        assertEquals(true, Program.checkEquality(new Integer(1), new Integer(1)));
    }

    @Test
    public void test4(){
        assertEquals(false, Program.checkEquality(new Integer(0), ""));
    }

    @Test
    public void test5(){
        assertEquals(true, Program.checkEquality("1", "1"));
    }

    @Test
    public void test6(){
        assertEquals(false, Program.checkEquality(new Integer(0), false));
    }

    @Test
    public void test7(){
        assertEquals(false, Program.checkEquality(null, false));
    }
}