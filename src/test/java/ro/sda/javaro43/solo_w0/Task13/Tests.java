package ro.sda.javaro43.solo_w0.Task13;

import org.junit.Test;
import ro.sda.javaro43.solo_w0.Task13.Challenge;

import static org.junit.Assert.*;

public final class Tests {
        @Test
        public void test1() {
            assertFalse(Challenge.isSeven(4));
        }

        @Test
        public void test2() {
            assertFalse(Challenge.isSeven(9));
        }

        @Test
        public void test3() {
            assertTrue(Challenge.isSeven(7));
        }
    }
