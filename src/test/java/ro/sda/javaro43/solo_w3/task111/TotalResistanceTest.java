package ro.sda.javaro43.solo_w3.task111;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TotalResistanceTest {
    @Test
    public void test1() {
        assertEquals(2, TotalResistance.parallelResistance(new int[] {6, 3}), 6);
    }

    @Test
    public void test2() {
        assertEquals(1.5, TotalResistance.parallelResistance(new int[] {6, 3, 6}), 6);
    }

    @Test
    public void test3() {
        assertEquals(5, TotalResistance.parallelResistance(new int[] {10, 10}), 6);
    }

    @Test
    public void test4() {
        assertEquals(4, TotalResistance.parallelResistance(new int[] {10, 20, 10}), 6);
    }

    @Test
    public void test5() {
        assertEquals(10, TotalResistance.parallelResistance(new int[] {60, 30, 20}), 6);
    }

    @Test
    public void test6() {
        assertEquals(3.2, TotalResistance.parallelResistance(new int[] {16, 4}), 6);
    }

    @Test
    public void test7() {
        assertEquals(4, TotalResistance.parallelResistance(new int[] {20, 5}), 6);
    }

    @Test
    public void test8() {
        assertEquals(166.7, TotalResistance.parallelResistance(new int[] {500, 500, 500}), 6);
    }

    @Test
    public void test9() {
        assertEquals(0.3, TotalResistance.parallelResistance(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 6);
    }
}