package ro.sda.javaro43.solo_w1.task41;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class SolutionTest {

    Mubashir k = new Mubashir();

    @Test
    public void test() {
        assertEquals(Arrays.asList(1), k.PrintArray(1));
        assertEquals(Arrays.asList(1,2), k.PrintArray(2));
        assertEquals(Arrays.asList(1,2,3), k.PrintArray(3));
        assertEquals(Arrays.asList(1,2,3,4), k.PrintArray(4));
        assertEquals(Arrays.asList(1,2,3,4,5), k.PrintArray(5));
        assertEquals(Arrays.asList(1,2,3,4,5,6), k.PrintArray(6));
        assertEquals(Arrays.asList(1,2,3,4,5,6,7), k.PrintArray(7));
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), k.PrintArray(8));
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10), k.PrintArray(10));
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9), k.PrintArray(9));
    }
}