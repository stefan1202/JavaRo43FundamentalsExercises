package ro.sda.javaro43.Task3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void test1(){
        assertEquals(true, Program.isSameNum(2,2));
    }
    @Test
    public void test2(){
        assertEquals(false, Program.isSameNum(0, 6));
    }
    @Test
    public void test3(){
        assertEquals(false, Program.isSameNum(43, 32));
    }
}