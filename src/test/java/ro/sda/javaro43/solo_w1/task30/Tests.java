package ro.sda.javaro43.solo_w1.task30;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1(){
        assertEquals(Challenge.frames(1, 1), 60);
    }

    @Test
    public void test2(){
        assertEquals(Challenge.frames(10, 1), 600);
    }

    @Test
    public void test3(){
        assertEquals(Challenge.frames(10, 25), 15000);
    }

    @Test
    public void test4(){
        assertEquals(Challenge.frames(500, 60), 1800000);
    }
    @Test
    public void test5(){
        assertEquals(Challenge.frames(0, 60), 0);
    }

    @Test
    public void test6(){
        assertEquals(Challenge.frames(99, 1), 5940);
    }

    @Test
    public void test7(){
        assertEquals(Challenge.frames(419, 70), 1759800);
    }

    @Test
    public void test8(){
        assertEquals(Challenge.frames(52, 33), 102960);
    }
}