package ro.sda.javaro43.solo_w3.task133;

import org.junit.Test;
import ro.sda.javaro43.solo_w2.solo_w3.task133.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals("j4v45cr1pt 15 c00l", Challenge.hackerSpeak("javascript is cool"));
    }

    @Test
    public void test2() {
        assertEquals("b3c0m3 4 c0d3r", Challenge.hackerSpeak("become a coder"));
    }

    @Test
    public void test3() {
        assertEquals("h1 th3r3", Challenge.hackerSpeak("hi there"));
    }

    @Test
    public void test4() {
        assertEquals("pr0gr4mm1ng 15 fun", Challenge.hackerSpeak("programming is fun"));
    }

    @Test
    public void test5() {
        assertEquals("k33p 0n pr4ct1c1ng", Challenge.hackerSpeak("keep on practicing"));
    }
}