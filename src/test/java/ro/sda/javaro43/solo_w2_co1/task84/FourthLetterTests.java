package ro.sda.javaro43.solo_w2_co1.task84;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FourthLetterTests {
    private String[] sentences = new String[] {
            "My friend Dylan got distracted in school.",
            "Debris was scattered all over the yard.",
            "The rodents hibernated in their den.",
            "The deepest part of the ocean is the darkest and most dreaded."
    };

    @Test
    public void test1() {
        assertEquals(FourthLetter.countDs(sentences[0]), 4);
    }

    @Test
    public void test2() {
        assertEquals(FourthLetter.countDs(sentences[1]), 3);
    }

    @Test
    public void test3() {
        assertEquals(FourthLetter.countDs(sentences[2]), 3);
    }

    @Test
    public void test4() {
        assertEquals(FourthLetter.countDs(sentences[3]), 6);
    }
}