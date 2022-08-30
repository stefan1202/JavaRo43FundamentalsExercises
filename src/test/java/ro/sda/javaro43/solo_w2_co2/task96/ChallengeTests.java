package ro.sda.javaro43.solo_w2_co2.task96;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w2_co2.task96.Challenge;

import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.additiveInverse(new int[]{5, -7, 8, 3}), is(new int[]{-5, 7, -8, -3}));
    }

    @Test
    public void test2() {
        assertThat(Challenge.additiveInverse(new int[]{1, 1, 1, 1, 1}), is(new int[]{-1, -1, -1, -1, -1}));
    }

    @Test
    public void test3() {
        assertThat(Challenge.additiveInverse(new int[]{-5, -25, 35}), is(new int[]{5, 25, -35}));
    }
}