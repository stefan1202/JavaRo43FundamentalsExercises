package ro.sda.javaro43.solo_w0.task8;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w0.task8.Challenge;

import static org.junit.Assert.assertThat;

public class ChallengeTest {
    @Test
    public void test1() {
        assertThat(Challenge.nextEdge(5, 4), is(8));
    }

    @Test
    public void test2() {
        assertThat(Challenge.nextEdge(8, 3), is(10));
    }

    @Test
    public void test3() {
        assertThat(Challenge.nextEdge(7, 9), is(15));
    }

    @Test
    public void test4() {
        assertThat(Challenge.nextEdge(10, 4), is(13));
    }

    @Test
    public void test5() {
        assertThat(Challenge.nextEdge(7, 2), is(8));
    }
}