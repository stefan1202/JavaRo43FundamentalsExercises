package ro.sda.javaro43.solo_w2_co1.task71;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTest {
    @Test
    public void test1(){
        assertEquals(360.0, Challenge.toDegree(2 * Math.PI), 6);
    }
    @Test
    public void test2(){
        assertEquals(180.0, Challenge.toDegree(Math.PI), 6);
    }
    @Test
    public void test3(){
        assertEquals(90.0, Challenge.toDegree(Math.PI / 2), 6);
    }
    @Test
    public void test4(){
        assertEquals(45.0, Challenge.toDegree(Math.PI / 4), 6);
    }
    @Test
    public void test5(){
        assertEquals(true, 60 - Challenge.toDegree(Math.PI / 3) < 0.1);
    }
}