package ro.sda.javaro43.solo_w2_co1.task86;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.firstLast(new String[]{"undefined", "6", "hello", "null"}), is(new String[]{"undefined", "null"}));
    }

    @Test
    public void test2() {
        assertThat(Challenge.firstLast(new String[]{"hello", "edabit", "dot", "com"}), is(new String[]{"hello", "com"}));
    }

    @Test
    public void test3() {
        assertThat(Challenge.firstLast(new String[]{"one", "two"}), is(new String[]{"one", "two"}));
    }
}