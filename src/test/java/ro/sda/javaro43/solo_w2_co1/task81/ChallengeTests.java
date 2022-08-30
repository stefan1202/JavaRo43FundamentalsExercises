package ro.sda.javaro43.solo_w2_co1.task81;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ChallengeTests {
    @Test
    public void test1() {
        assertThat(Challenge.countCharacters(new String[] {"###","###","###"}), is(9));
    }

    @Test
    public void test2() {
        assertThat(Challenge.countCharacters(new String[] {"22222222", "22222222"}), is(16));
    }

    @Test
    public void test3() {
        assertThat(Challenge.countCharacters(new String[] {"------------------"}), is(18));
    }

    @Test
    public void test4() {
        assertThat(Challenge.countCharacters(new String[] {}), is(0));
    }

    @Test
    public void test5() {
        assertThat(Challenge.countCharacters(new String[] {"", ""}), is(0));
    }
}