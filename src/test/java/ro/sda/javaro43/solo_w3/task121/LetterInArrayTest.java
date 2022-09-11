package ro.sda.javaro43.solo_w3.task121;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task121.LetterInArray;

public class LetterInArrayTest {
    @Test
    public void test1() {
        assertEquals(true, LetterInArray.forbiddenLetter("m", new String[] {"deep", "loves", "tesh"}));
    }

    @Test
    public void test2() {
        assertEquals(false, LetterInArray.forbiddenLetter("e", new String[] {"deep", "xavier", "tesh", "tesha"}));
    }

    @Test
    public void test3() {
        assertEquals(false, LetterInArray.forbiddenLetter("e", new String[] {"rinse", "and", "repeat"}));
    }

    @Test
    public void test4() {
        assertEquals(true, LetterInArray.forbiddenLetter("d", new String[] {"python", "javascript", "ruby", "fortran"}));
    }

    @Test
    public void test5() {
        assertEquals(true, LetterInArray.forbiddenLetter("a", new String[] {"spoon", "fork", "knife"}));
    }

    @Test
    public void test6() {
        assertEquals(true, LetterInArray.forbiddenLetter("b", new String[] {"test", "dot", "assert", "equals"}));
    }

    @Test
    public void test7() {
        assertEquals(false, LetterInArray.forbiddenLetter("i", new String[] {"rock", "paper", "scissors"}));
    }

    @Test
    public void test8() {
        assertEquals(true, LetterInArray.forbiddenLetter("t", new String[] {}));
    }
}
// credit goes to original author @Joshua Señoron