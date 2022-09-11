package ro.sda.javaro43.solo_w3.task129;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task129.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(1, Challenge.charCount('a', "edabit"));
    }

    @Test
    public void test2() {
        assertEquals(4, Challenge.charCount('b', "big fat bubble"));
    }

    @Test
    public void test3() {
        assertEquals(1, Challenge.charCount('c', "Chamber of secrets"));
    }

    @Test
    public void test4() {
        assertEquals(7, Challenge.charCount('f', "frank and his friends have offered five foxes for sale"));
    }

    @Test
    public void test5() {
        assertEquals(0, Challenge.charCount('x', "edabit"));
    }

    @Test
    public void test6() {
        assertEquals(6, Challenge.charCount('a', "Adam and Eve bit the apple and found a snake"));
    }

    @Test
    public void test7() {
        assertEquals(25, Challenge.charCount('s', "sssssssssssssssssssssssss"));
    }

    @Test
    public void test8() {
        assertEquals(2, Challenge.charCount('7', "10795426697"));
    }
}