package ro.sda.javaro43.solo_w2_co2.task102;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.search(new int[]{1, 2, 3, 4}, 3), is(2));
    }

    @Test
    public void test2() {
        assertThat(Challenge.search(new int[]{2, 4, 6, 8, 10}, 8), is(3));
    }

    @Test
    public void test3() {
        assertThat(Challenge.search(new int[]{1, 3, 5, 7, 9}, 11), is(-1));
    }

    @Test
    public void test4() {
        assertThat(Challenge.search(new int[]{1, 5, 7, 11, 25, 100, 200, 350}, 5), is(1));
    }
}