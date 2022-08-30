package ro.sda.javaro43.solo_w2.task66;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExperiencePointsTest {
    @Test
    public void test1() {
        assertEquals("2055XP", ExperiencePoints.getXP(new int[] {89, 77, 30, 4, 1}));
    }

    @Test
    public void test2() {
        assertEquals("7650XP", ExperiencePoints.getXP(new int[] {254, 32, 65, 51, 34}));
    }

    @Test
    public void test3() {
        assertEquals("2255XP", ExperiencePoints.getXP(new int[] {11, 0, 2, 0, 27}));
    }

    @Test
    public void test4() {
        assertEquals("6170XP", ExperiencePoints.getXP(new int[] {94, 54, 46, 66, 20}));
    }

    @Test
    public void test5() {
        assertEquals("2180XP", ExperiencePoints.getXP(new int[] {200, 12, 13, 20, 0}));
    }

    @Test
    public void test6() {
        assertEquals("5755XP", ExperiencePoints.getXP(new int[] {197, 19, 79, 41, 17}));
    }
}