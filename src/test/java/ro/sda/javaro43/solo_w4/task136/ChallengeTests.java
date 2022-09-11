package ro.sda.javaro43.solo_w4.task136;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w4.task136.Challenge;

import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.testJackpot(new String[]{"@", "@", "@", "@"}), is(true));
    }

    @Test
    public void test2() {
        assertThat(Challenge.testJackpot(new String[]{"!", "!", "!", "!"}), is(true));
    }

    @Test
    public void test3() {
        assertThat(Challenge.testJackpot(new String[]{"abc", "abc", "abc", "abc"}), is(true));
    }

    @Test
    public void test4() {
        assertThat(Challenge.testJackpot(new String[]{"karaoke", "karaoke", "karaoke", "karaoke"}), is(true));
    }

    @Test
    public void test5() {
        assertThat(Challenge.testJackpot(new String[]{"SS", "SS", "SS", "SS"}), is(true));
    }

    @Test
    public void test6() {
        assertThat(Challenge.testJackpot(new String[]{":(", ":)", ":|", ":|"}), is(false));
    }

    @Test
    public void test7() {
        assertThat(Challenge.testJackpot(new String[]{"&&", "&", "&&&", "&&&&"}), is(false));
    }

    @Test
    public void test8() {
        assertThat(Challenge.testJackpot(new String[]{"hee", "heh", "heh", "heh"}), is(false));
    }

    @Test
    public void test9() {
        assertThat(Challenge.testJackpot(new String[]{"SS", "SS", "SS", "Ss"}), is(false));
    }

    @Test
    public void test10() {
        assertThat(Challenge.testJackpot(new String[]{"SS", "SS", "Ss", "Ss"}), is(false));
    }
}