package ro.sda.javaro43.solo_w1.task42;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTest {
    @Test
    public void test1(){
        assertEquals(15, Challenge.getArea(5, 3));
    }

    @Test
    public void test2(){
        assertEquals(40, Challenge.getArea(8, 5));
    }

    @Test
    public void test3(){
        assertEquals(20, Challenge.getArea(5, 4));
    }

    @Test
    public void test4(){
        assertEquals(6, Challenge.getArea(2, 3));
    }

    @Test
    public void test5(){
        assertEquals(100000000, Challenge.getArea(10000, 10000));
    }

    @Test
    public void test6(){
        assertEquals(-1, Challenge.getArea(-2, -5));
    }

    @Test
    public void test7(){
        assertEquals(-1, Challenge.getArea(0, 3));
    }

    @Test
    public void test8(){
        assertEquals(-1, Challenge.getArea(5, -3));
    }

    @Test
    public void test9(){
        assertEquals(-1, Challenge.getArea(1, 0));
    }

    @Test
    public void test10(){
        assertEquals(-1, Challenge.getArea(-1, 0));
    }
}