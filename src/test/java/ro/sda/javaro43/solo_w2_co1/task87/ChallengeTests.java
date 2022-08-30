package ro.sda.javaro43.solo_w2_co1.task87;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        System.out.println("1st month should be January.");
        assertEquals("January", Challenge.monthName(1));
    }

    @Test
    public void test2() {
        System.out.println("2nd month should be February.");
        assertEquals("February", Challenge.monthName(2));
    }

    @Test
    public void test3() {
        System.out.println("3rd month should be March.");
        assertEquals("March", Challenge.monthName(3));
    }

    @Test
    public void test4() {
        System.out.println("4th month should be April.");
        assertEquals("April", Challenge.monthName(4));
    }

    @Test
    public void test5() {
        System.out.println("5th month should be May.");
        assertEquals("May", Challenge.monthName(5));
    }

    @Test
    public void test6() {
        System.out.println("6th month should be June.");
        assertEquals("June", Challenge.monthName(6));
    }

    @Test
    public void test7() {
        System.out.println("7th month should be July.");
        assertEquals("July", Challenge.monthName(7));
    }

    @Test
    public void test8() {
        System.out.println("8th month should be August.");
        assertEquals("August", Challenge.monthName(8));
    }

    @Test
    public void test9() {
        System.out.println("9th month should be September.");
        assertEquals("September", Challenge.monthName(9));
    }

    @Test
    public void test10() {
        System.out.println("10th month should be October.");
        assertEquals("October", Challenge.monthName(10));
    }

    @Test
    public void test11() {
        System.out.println("11th month should be November.");
        assertEquals("November", Challenge.monthName(11));
    }

    @Test
    public void test12() {
        System.out.println("12th month should be December.");
        assertEquals("December", Challenge.monthName(12));
    }
}