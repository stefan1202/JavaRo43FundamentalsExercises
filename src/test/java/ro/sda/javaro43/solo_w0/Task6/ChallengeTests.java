package ro.sda.javaro43.solo_w0.Task6;
 import org.junit.Test;
 import ro.sda.javaro43.solo_w0.Task6.Challenge;

 import static org.junit.Assert.assertEquals;

    public class ChallengeTests {
        @Test
        public void test1() {
            assertEquals(26, Challenge.findPerimeter(6, 7));
        }

        @Test
        public void test2() {
            assertEquals(60, Challenge.findPerimeter(20, 10));
        }

        @Test
        public void test3() {
            assertEquals(22, Challenge.findPerimeter(2, 9));
        }
    }

