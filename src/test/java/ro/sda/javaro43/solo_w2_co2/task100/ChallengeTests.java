package ro.sda.javaro43.solo_w2_co2.task100;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(FindIndex.findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh"), is(2));
    }

    @Test
    public void test2() {
        assertThat(FindIndex.findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue"), is(1));
    }

    @Test
    public void test3() {
        assertThat(FindIndex.findIndex(new String[]{"a", "g", "y", "d"}, "d"), is(3));
    }

    @Test
    public void test4() {
        assertThat(FindIndex.findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple"), is(0));
    }
}