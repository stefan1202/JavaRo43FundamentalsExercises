package ro.sda.javaro43.solo_w3.task124;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task124.Challenge;

import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.minimumRemovals(new int[]{1, 2, 3, 4, 5}), is(1));
    }

    @Test
    public void test2() {
        assertThat(Challenge.minimumRemovals(new int[]{5, 7, 9, 11}), is(0));
    }

    @Test
    public void test3() {
        assertThat(Challenge.minimumRemovals(new int[]{5, 7, 9, 12}), is(1));
    }

    @Test
    public void test4() {
        assertThat(Challenge.minimumRemovals(new int[]{5, 8, 8, 8}), is(1));
    }

    @Test
    public void test5() {
        assertThat(Challenge.minimumRemovals(new int[]{5, 8, 8, 8, 9, 9}), is(1));
    }

    @Test
    public void test6() {
        assertThat(Challenge.minimumRemovals(new int[]{9, 8, 8, 8, 9, 9}), is(1));
    }

    @Test
    public void test7() {
        assertThat(Challenge.minimumRemovals(new int[]{5, 5, 4, 4, 3, 3}), is(0));
    }

    @Test
    public void test8() {
        assertThat(Challenge.minimumRemovals(new int[]{5, 3, 4, 4, 3}), is(1));
    }

    @Test
    public void test9() {
        assertThat(Challenge.minimumRemovals(new int[]{5, 3, 4, 4, 0}), is(0));
    }
}