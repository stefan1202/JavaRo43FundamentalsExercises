package ro.sda.javaro43.solo_w3.task123;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task123.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("ell", Challenge.removeFirstLast("hello"));
    }

    @Test
    public void test2() {
        assertEquals("enefi", Challenge.removeFirstLast("benefit"));
    }

    @Test
    public void test3() {
        assertEquals("ord", Challenge.removeFirstLast("wordy"));
    }

    @Test
    public void test4() {
        assertEquals("ayb", Challenge.removeFirstLast("maybe"));
    }

    @Test
    public void test5() {
        assertEquals("to", Challenge.removeFirstLast("to"));
    }

    @Test
    public void test6() {
        assertEquals("a", Challenge.removeFirstLast("a"));
    }

    @Test
    public void test7() {
        assertEquals("", Challenge.removeFirstLast(""));
    }
}