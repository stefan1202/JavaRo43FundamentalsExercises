package ro.sda.javaro43.solo_w2_co2.task103;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("I'm gonna rwidwe 'twil I can't no morwe owo", Challenge.owofied("I'm gonna ride 'til I can't no more"));
    }

    @Test
    public void test2() {
        assertEquals("Do you wevwer fwewel lwikwe a plastwic bag owo", Challenge.owofied("Do you ever feel like a plastic bag"));
    }

    @Test
    public void test3() {
        assertEquals("Causwe baby you'rwe a fwirwework owo", Challenge.owofied("Cause baby you're a firework"));
    }

    @Test
    public void test4() {
        assertEquals("Nwevwer gonna gwivwe you up owo", Challenge.owofied("Never gonna give you up"));
    }

    @Test
    public void test5() {
        assertEquals("Wwe'vwe known weach othwer for so long owo", Challenge.owofied("We've known each other for so long"));
    }

    @Test
    public void test6() {
        assertEquals("Nwevwer gonna lwet you down owo", Challenge.owofied("Never gonna let you down"));
    }

    @Test
    public void test7() {
        assertEquals("Shwinwe brwight lwikwe a dwiamond owo", Challenge.owofied("Shine bright like a diamond"));
    }
}