package ro.sda.javaro43.solo_w2_co1.task92;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(300.0, Challenge.TotalDistance(0.2, 0.4, 100.0),0.1);
    }

    @Test
    public void test2() {
        assertEquals(18.3, Challenge.TotalDistance(0.12, 0.1, 10.0),0.1);
    }

    @Test
    public void test3() {
        assertEquals(50.0, Challenge.TotalDistance(0.5, 0.5, 25.0),0.1);
    }

    @Test
    public void test4() {
        assertEquals(12.0, Challenge.TotalDistance(0.1, 0.1, 6.0),0.1);
    }

    @Test
    public void test5() {
        assertEquals(3.3, Challenge.TotalDistance(0.05, 0.1, 1.1),0.1);
    }

    @Test
    public void test6() {
        assertEquals(1555.4, Challenge.TotalDistance(1.0, 1.0, 777.7),0.1);
    }

    @Test
    public void test7() {
        assertEquals(150.75, Challenge.TotalDistance(0.2, 0.1, 100.5),0.1);
    }
}