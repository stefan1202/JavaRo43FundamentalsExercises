package ro.sda.javaro43.solo_w2_co1.task74;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.squaresAndCubes(new int[]{4, 8}), is(true));
    }

    @Test
    public void test2() {
        assertThat(Challenge.squaresAndCubes(new int[]{16, 48}), is(false));
    }

    @Test
    public void test3() {
        assertThat(Challenge.squaresAndCubes(new int[]{9, 27}), is(true));
    }

    @Test
    public void test4() {
        assertThat(Challenge.squaresAndCubes(new int[]{25, 124}), is(false));
    }

    @Test
    public void test5() {
        assertThat(Challenge.squaresAndCubes(new int[]{25, 126}), is(false));
    }

    @Test
    public void test6() {
        assertThat(Challenge.squaresAndCubes(new int[]{1, 1}), is(true));
    }

    @Test
    public void test7() {
        assertThat(Challenge.squaresAndCubes(new int[]{676, 17576}), is(true));
    }
}