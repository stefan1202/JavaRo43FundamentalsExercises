package ro.sda.javaro43.solo_w2_co2.task97;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w2_co2.task97.Challenge;

import static org.junit.Assert.assertThat;

public class Tests {
    @Test
    public void test1() {
        assertThat(Challenge.sumOfCubes(new int[]{1, 5, 9}), is(855));
    }

    @Test
    public void test2() {
        assertThat(Challenge.sumOfCubes(new int[]{3, 4, 5}), is(216));
    }

    @Test
    public void test3() {
        assertThat(Challenge.sumOfCubes(new int[]{1, 1, 1}), is(3));
    }

    @Test
    public void test4() {
        assertThat(Challenge.sumOfCubes(new int[]{2}), is(8));
    }

    @Test
    public void test5() {
        assertThat(Challenge.sumOfCubes(new int[]{5, 1, 2}), is(134));
    }

    @Test
    public void test6() {
        assertThat(Challenge.sumOfCubes(new int[]{32}), is(32768));
    }

    @Test
    public void test7() {
        assertThat(Challenge.sumOfCubes(new int[]{5, 9, 4, 4, 9}), is(1711));
    }

    @Test
    public void test8() {
        assertThat(Challenge.sumOfCubes(new int[]{0, 1, 2}), is(9));
    }

    @Test
    public void test9() {
        assertThat(Challenge.sumOfCubes(new int[]{}), is(0));
    }
}