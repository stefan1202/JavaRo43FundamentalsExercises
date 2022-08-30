package ro.sda.javaro43.solo_w2_co1.task88;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class Tests {
    @Test
    public void test1() {
        assertThat(Challenge.calcDeterminant(new int[][]{{1, 2}, {3, 4}}), is(-2));
    }

    @Test
    public void test2() {
        assertThat(Challenge.calcDeterminant(new int[][]{{5, 3}, {3, 1}}), is(-4));
    }

    @Test
    public void test3() {
        assertThat(Challenge.calcDeterminant(new int[][]{{1, 1}, {1, 1}}), is(0));
    }

    @Test
    public void test4() {
        assertThat(Challenge.calcDeterminant(new int[][]{{1, 1}, {1, 0}}), is(-1));
    }
}