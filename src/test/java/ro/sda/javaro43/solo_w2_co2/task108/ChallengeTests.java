package ro.sda.javaro43.solo_w2_co2.task108;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.checkFactors(new int[]{2, 3, 4}, 12), is(true));
    }

    @Test
    public void test2() {
        assertThat(Challenge.checkFactors(new int[]{1, 2, 3, 8}, 12), is(false));
    }

    @Test
    public void test3() {
        assertThat(Challenge.checkFactors(new int[]{1, 2, 50}, 100), is(true));
    }

    @Test
    public void test4() {
        assertThat(Challenge.checkFactors(new int[]{1, 9, 81}, 81), is(true));
    }

    @Test
    public void test5() {
        assertThat(Challenge.checkFactors(new int[]{5, 10, 50}, 500), is(true));
    }

    @Test
    public void test6() {
        assertThat(Challenge.checkFactors(new int[]{5, 10, 499}, 500), is(false));
    }

    @Test
    public void test7() {
        assertThat(Challenge.checkFactors(new int[]{3, 6}, 9), is(false));
    }
}