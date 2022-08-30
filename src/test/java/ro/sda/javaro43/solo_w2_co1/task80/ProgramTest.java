package ro.sda.javaro43.solo_w2_co1.task80;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        assertEquals("edabit is amazing.", Program.amazingEdabit("edabit is amazing."));
    }
    @Test
    public void test2(){assertEquals("Mubashir is not amazing.", Program.amazingEdabit("Mubashir is amazing."));
    }
    @Test
    public void test3() {
        assertEquals("Trump is not amazing.", Program.amazingEdabit("Trump is amazing."));
    }
    @Test
    public void test4() {
        assertEquals("Infinity is not amazing.", Program.amazingEdabit("Infinity is amazing."));
    }
    @Test
    public void test5() {
        assertEquals("Mubashir and edabit are amazing.", Program.amazingEdabit("Mubashir and edabit are amazing."));
    }
    @Test
    public void test6(){assertEquals("Matt is not amazing.", Program.amazingEdabit("Matt is amazing."));
    }
    @Test
    public void test7(){assertEquals("Helen is not amazing.", Program.amazingEdabit("Helen is amazing."));
    }
    @Test
    public void test8(){assertEquals("Python and edabit are amazing.", Program.amazingEdabit("Python and edabit are amazing."));
    }
    @Test
    public void test9(){assertEquals("C++ is not amazing.", Program.amazingEdabit("C++ is amazing."));
    }
    @Test
    public void test10(){assertEquals("javascript is not amazing.", Program.amazingEdabit("javascript is amazing."));}

    @Test
    public void test11(){assertEquals("java is not amazing.", Program.amazingEdabit("java is amazing."));
    }
    @Test
    public void test12(){assertEquals("ruby is not amazing.", Program.amazingEdabit("ruby is amazing."));
    }
    @Test
    public void test13(){assertEquals("SQL is not amazing.", Program.amazingEdabit("SQL is amazing."));
    }
    @Test
    public void test14(){assertEquals("CSS is not amazing.", Program.amazingEdabit("CSS is amazing."));
    }
    @Test
    public void test15(){assertEquals("Pakistan is amazing. edabit", Program.amazingEdabit("Pakistan is amazing. edabit"));
    }
    @Test
    public void test16(){assertEquals("You and edabit are amazing.", Program.amazingEdabit("You and edabit are amazing."));
    }
    @Test
    public void test17(){assertEquals("Matt and edabit are amazing.", Program.amazingEdabit("Matt and edabit are amazing."));
    }
    @Test
    public void test18(){assertEquals("Helen and edabit are amazing.", Program.amazingEdabit("Helen and edabit are amazing."));
    }
    @Test
    public void test19(){assertEquals("Everyone is not amazing.", Program.amazingEdabit("Everyone is amazing."));
    }
    @Test
    public void test20(){assertEquals("Swift and edabit are amazing.", Program.amazingEdabit("Swift and edabit are amazing."));
    }
}