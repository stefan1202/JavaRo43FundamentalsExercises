package ro.sda.javaro43.solo_w2_co1.task93;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ModulusOperatorTest {
    @Test
    public void test1(){
        assertEquals(0, ModulusOperator.mod(0, 3));
    }

    @Test
    public void test2(){
        assertEquals(1, ModulusOperator.mod(1, 3));
    }

    @Test
    public void test3(){
        assertEquals(2, ModulusOperator.mod(5, 3));
    }

    @Test
    public void test4(){
        assertEquals(4, ModulusOperator.mod(4, 5));
    }

    @Test
    public void test5(){
        assertEquals(3, ModulusOperator.mod(218, 5));
    }
}