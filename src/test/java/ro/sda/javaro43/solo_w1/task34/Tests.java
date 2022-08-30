package ro.sda.javaro43.solo_w1.task34;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void winning_test_1() {
        assertEquals(true, Challenge.profitableGamble(0.2, 50, 9));
    }

    @Test
    public void winning_test_2() {
        assertEquals(true, Challenge.profitableGamble(0.9, 3, 2));
    }

    @Test
    public void winning_test_3() {
        assertEquals(true, Challenge.profitableGamble(0.33, 10, 3.30));
    }

    @Test
    public void winning_test_4() {
        assertEquals(true, Challenge.profitableGamble(0.1, 1000, 7));
    }

    @Test
    public void losing_test_1() {
        assertEquals(false, Challenge.profitableGamble(0.9, 1, 2));
    }

    @Test
    public void losing_test_2() {
        assertEquals(false, Challenge.profitableGamble(0, 1000, 0.01));
    }

    @Test
    public void breaking_even_test() {
        assertEquals(false, Challenge.profitableGamble(0, 0, 0));
    }
}