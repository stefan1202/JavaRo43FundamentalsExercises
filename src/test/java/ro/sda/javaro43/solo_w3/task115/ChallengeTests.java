package ro.sda.javaro43.solo_w3.task115;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task115.Challenge;

import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.addEnding(new String[]{"clever", "meek", "hurried", "nice"}, "ly"), is(new String[]{"cleverly", "meekly", "hurriedly", "nicely"}));
    }

    @Test
    public void test2() {
        assertThat(Challenge.addEnding(new String[]{"new", "pander", "scoop"}, "er"), is(new String[]{"newer", "panderer", "scooper"}));
    }

    @Test
    public void test3() {
        assertThat(Challenge.addEnding(new String[]{"bend", "sharpen", "mean"}, "ing"), is(new String[]{"bending", "sharpening", "meaning"}));
    }

    @Test
    public void test4() {
        assertThat(Challenge.addEnding(new String[]{"bend", "tooth", "mint"}, "y"), is(new String[]{"bendy", "toothy", "minty"}));
    }

    @Test
    public void test5() {
        assertThat(Challenge.addEnding(new String[]{"bend", "tooth", "mint"}, "ier"), is(new String[]{"bendier", "toothier", "mintier"}));
    }
}