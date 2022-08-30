package ro.sda.javaro43.solo_w2_co2.task101;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.transform(new int[]{1, 2, 3, 4, 5}), is(new int[]{2, 1, 4, 3, 6}));
    }

    @Test
    public void test2() {
        assertThat(Challenge.transform(new int[]{3, 3, 4, 3}), is(new int[]{4, 4, 3, 4}));
    }

    @Test
    public void test3() {
        assertThat(Challenge.transform(new int[]{2, 2, 0, 8, 10}), is(new int[]{1, 1, -1, 7, 9}));
    }

    @Test
    public void test4() {
        assertThat(Challenge.transform(new int[]{9, 13, 15, 5, 2, 11}), is(new int[]{10, 14, 16, 6, 1, 12}));
    }
}