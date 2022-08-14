package ro.sda.javaro43.Task13;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
    public final class Tests {
        @Test
        public void test1() {
            assertEquals(false, Challenge.isSeven(4));
        }

        @Test
        public void test2() {
            assertEquals(false, Challenge.isSeven(9));
        }

        @Test
        public void test3() {
            assertEquals(true, Challenge.isSeven(7));
        }
    }
