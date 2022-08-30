package ro.sda.javaro43.solo_w0.task20;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ro.sda.javaro43.solo_w0.task20.Challenge;

import static org.junit.Assert.assertThat;

public class Tests {
    @Test
    public void test1() {
        assertThat(Challenge.animals(5, 2, 8), is(50));
    }

    @Test
    public void test2() {
        assertThat(Challenge.animals(3, 4, 7), is(50));
    }

    @Test
    public void test3() {
        assertThat(Challenge.animals(1, 2, 3), is(22));
    }

    @Test
    public void test4() {
        assertThat(Challenge.animals(3, 5, 2), is(34));
    }
}