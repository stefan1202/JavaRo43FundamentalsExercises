package ro.sda.javaro43.solo_w0.task15;

import org.junit.Test;
import ro.sda.javaro43.solo_w0.task15.Age;

import static org.junit.Assert.assertEquals;

public class AgeTests {



        @Test
        public void test01() {
            assertEquals(Age.calcAge(10), 3650);
        }

        @Test
        public void test02() {
            assertEquals(Age.calcAge(0), 0);
        }

        @Test
        public void test03() {
            assertEquals(Age.calcAge(73), 26645);
        }

        @Test
        public void test04() {
            assertEquals(Age.calcAge(20), 7300);
        }

        @Test
        public void test05() {
            assertEquals(Age.calcAge(40), 14600);
        }

        @Test
        public void test06() {
            assertEquals(Age.calcAge(66), 24090);
        }
}
