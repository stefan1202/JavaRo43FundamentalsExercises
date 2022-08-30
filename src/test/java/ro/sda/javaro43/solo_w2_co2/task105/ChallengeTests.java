package ro.sda.javaro43.solo_w2_co2.task105;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.correctStream(new String[]{"it", "is", "find"}, new String[]{"it", "is", "fine"}), is(new int[]{1, 1, -1}));
    }

    @Test
    public void test2() {
        assertThat(Challenge.correctStream(new String[]{"april", "showrs", "bring", "may", "flowers"}, new String[]{"april", "showers", "bring", "may", "flowers"}), is(new int[]{1, -1, 1, 1, 1}));
    }

    @Test
    public void test3() {
        assertThat(Challenge.correctStream(new String[]{"weird", "indicr", "moment"}, new String[]{"weird", "indict", "moment"}), is(new int[]{1, -1, 1}));
    }

    @Test
    public void test4() {
        assertThat(Challenge.correctStream(new String[]{"starry", "wind", "skies"}, new String[]{"starry", "wind", "skies"}), is(new int[]{1, 1, 1}));
    }
}