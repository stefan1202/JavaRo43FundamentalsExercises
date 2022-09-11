package ro.sda.javaro43.solo_w3.task130;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task132.task130.Program;

import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Program.getAbsSum(new int[]{2, -1, -3, 4, 8}), is(18));
    }

    @Test
    public void test2() {
        assertThat(Program.getAbsSum(new int[]{-1}), is(1));
    }

    @Test
    public void test3() {
        assertThat(Program.getAbsSum(new int[]{-1, -3, -5, -4, -10, 0}), is(23));
    }

    @Test
    public void test4() {
        assertThat(Program.getAbsSum(new int[]{8, 9, 10, 32, 101, -10}), is(170));
    }

    @Test
    public void test5() {
        assertThat(Program.getAbsSum(new int[]{500}), is(500));
    }
}