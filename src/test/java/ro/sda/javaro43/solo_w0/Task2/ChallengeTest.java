package ro.sda.javaro43.solo_w0.Task2;
 import org.junit.Test;
 import ro.sda.javaro43.solo_w0.Task2.Challenge;

 import static org.junit.Assert.assertEquals;

    public class ChallengeTest {
        @Test
        public void test1() {
            System.out.println("2 plus 1 equals 3.");
            assertEquals(3, Challenge.addition(2));
        }

        @Test
        public void test2() {
            System.out.println("-8 plus 1 equals 9.");
            assertEquals(-8, Challenge.addition(-9));

        }
        @Test
        public void test3() {
            System.out.println("0 plus 1 equals 1.");
            assertEquals(1, Challenge.addition(0));
        }

        @Test
        public void test4() {
            System.out.println("999 plus 1 equals 1000.");
            assertEquals(1000, Challenge.addition(999));
        }

        @Test
        public void test5() {
            System.out.println("73 plus 1 equals 74.");
            assertEquals(74, Challenge.addition(73));
        }
    }
