package ro.sda.javaro43.solo_w3.task117;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task117.Challenge;

import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.search(new int[]{1, 5, 3}, 5), is(1));
    }

    @Test
    public void test2() {
        assertThat(Challenge.search(new int[]{9, 8, 3}, 3), is(2));
    }

    @Test
    public void test3() {
        assertThat(Challenge.search(new int[]{1, 2, 3}, 4), is(-1));
    }

    @Test
    public void test4() {
        assertThat(Challenge.search(new int[]{1, 5, 3, 10, 17, 20, -6}, 20), is(5));
    }
}