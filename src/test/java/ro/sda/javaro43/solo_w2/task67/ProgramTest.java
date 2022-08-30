package ro.sda.javaro43.solo_w2.task67;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        assertEquals(13, Program.arraySum(new int[]{2, 7, 4}));
    }
    @Test
    public void test2(){
        assertEquals(48, Program.arraySum(new int[]{45, 3, 0}));
    }
    @Test
    public void test3(){
        assertEquals(105, Program.arraySum(new int[]{-2, 84, 23}));
    }
}
