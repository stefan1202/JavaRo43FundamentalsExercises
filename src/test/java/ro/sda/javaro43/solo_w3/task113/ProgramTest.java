package ro.sda.javaro43.solo_w3.task113;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1() {
        assertEquals(Program.preventDistractions("vines that butter my eggroll"), "NO!");
    }

    @Test
    public void test2() {
        assertEquals(Program.preventDistractions("Hot pictures of Danny DeVito"), "NO!");
    }

    @Test
    public void test3() {
        assertEquals(Program.preventDistractions("top 10 insert random yt celebrity roasts"), "NO!");
    }

    @Test
    public void test4() {
        assertEquals(Program.preventDistractions("best anime food ever!"), "NO!");
    }

    @Test
    public void test5() {
        assertEquals(Program.preventDistractions("How to Be a Productive Member of Society"), "Safe watching!");
    }
}