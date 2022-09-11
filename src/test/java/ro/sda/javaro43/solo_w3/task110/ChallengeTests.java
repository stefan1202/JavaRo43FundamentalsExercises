package ro.sda.javaro43.solo_w3.task110;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task110.Challenge;

import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.mysteryFunc(new int[]{5, 7, 8, 2, 1}, 2), is(new int[]{1, 1, 0, 0, 1}));
    }

    @Test
    public void test2() {
        assertThat(Challenge.mysteryFunc(new int[]{9, 8, 16, 47}, 4), is(new int[]{1, 0, 0, 3}));
    }

    @Test
    public void test3() {
        assertThat(Challenge.mysteryFunc(new int[]{17, 11, 99, 55, 23, 1}, 5), is(new int[]{2, 1, 4, 0, 3, 1}));
    }

    @Test
    public void test4() {
        assertThat(Challenge.mysteryFunc(new int[]{6, 1}, 7), is(new int[]{6, 1}));
    }

    @Test
    public void test5() {
        assertThat(Challenge.mysteryFunc(new int[]{3, 2, 9}, 3), is(new int[]{0, 2, 0}));
    }

    @Test
    public void test6() {
        assertThat(Challenge.mysteryFunc(new int[]{48, 22, 0, 19, 33, 100}, 10), is(new int[]{8, 2, 0, 9, 3, 0}));
    }
}