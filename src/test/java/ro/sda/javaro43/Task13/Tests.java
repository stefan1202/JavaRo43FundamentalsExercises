package ro.sda.javaro43.Task13;

import junit.framework.TestCase;
import org.junit.Test;

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
