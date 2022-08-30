package ro.sda.javaro43.solo_w2.task51;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void true_test_1() {
        assertEquals(true, Challenge.equalSlices(8, 3, 2));
    }

    @Test
    public void true_test_2() {
        assertEquals(true, Challenge.equalSlices(5, 0, 100));
    }

    @Test
    public void true_test_3() {
        assertEquals(true, Challenge.equalSlices(15, 2, 7));
    }

    @Test
    public void false_test_1() {
        assertEquals(false, Challenge.equalSlices(8, 3, 3));
    }

    @Test
    public void false_test_2() {
        assertEquals(false, Challenge.equalSlices(5, 6, 1));
    }

    @Test
    public void false_test_3() {
        assertEquals(false, Challenge.equalSlices(15, 2, 8));
    }

    @Test
    public void exactly_equal() {
        assertEquals(true, Challenge.equalSlices(24, 12, 2));
    }
}