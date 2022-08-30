package ro.sda.javaro43.solo_w2_co2.task98;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void TestSuite() {
        System.out.println("pas-try, flui-id and buffet each have 2 syllables");
        assertEquals(2, Challenge.numberSyllables("pas-try"));
        assertEquals(2, Challenge.numberSyllables("flu-id"));
        assertEquals(2, Challenge.numberSyllables("buf-fet"));
    }

    @Test
    public void ThreeSyllableWords() {
        System.out.println("beau-ti-ful, o-ver-ly and syl-la-ble each have 3 syllables");
        assertEquals(3, Challenge.numberSyllables("beau-ti-ful"));
        assertEquals(3, Challenge.numberSyllables("o-ver-ly"));
        assertEquals(3, Challenge.numberSyllables("syl-la-ble"));
    }

    @Test
    public void FourOrMoreSyllableWords() {
        System.out.println("mon-u-men-tal and on-o-mat-o-poe-ia each have 4+ syllables");
        assertEquals(4, Challenge.numberSyllables("mon-u-men-tal"));
        assertEquals(6, Challenge.numberSyllables("on-o-mat-o-poe-ia"));
    }
}