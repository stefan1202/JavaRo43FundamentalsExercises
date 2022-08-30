package ro.sda.javaro43.solo_w2_co1.task72;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class RgbColorTest {
    @Test
    public void test01() {
        assertArrayEquals(new int[] {0, 0, 0}, RgbColor.invertColor(new int[] {255, 255, 255}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[] {255, 255, 255}, RgbColor.invertColor(new int[] {0, 0, 0}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[] {90, 85, 34}, RgbColor.invertColor(new int[] {165, 170, 221}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[] {243, 242, 55}, RgbColor.invertColor(new int[] {12, 13, 200}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[] {243, 238, 58}, RgbColor.invertColor(new int[] {12, 17, 197}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[] {12, 13, 20}, RgbColor.invertColor(new int[] {243, 242, 235}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[] {90, 85, 136}, RgbColor.invertColor(new int[] {165, 170, 119}));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[] {90, 85, 119}, RgbColor.invertColor(new int[] {165, 170, 136}));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[] {90, 85, 102}, RgbColor.invertColor(new int[] {165, 170, 153}));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[] {90, 85, 85}, RgbColor.invertColor(new int[] {165, 170, 170}));
    }

    @Test
    public void test11() {
        assertArrayEquals(new int[] {90, 85, 68}, RgbColor.invertColor(new int[] {165, 170, 187}));
    }

    @Test
    public void test12() {
        assertArrayEquals(new int[] {90, 85, 51}, RgbColor.invertColor(new int[] {165, 170, 204}));
    }

    @Test
    public void test13() {
        assertArrayEquals(new int[] {90, 85, 34}, RgbColor.invertColor(new int[] {165, 170, 221}));
    }

    @Test
    public void test14() {
        assertArrayEquals(new int[] {90, 85, 17}, RgbColor.invertColor(new int[] {165, 170, 238}));
    }

    @Test
    public void test15() {
        assertArrayEquals(new int[] {90, 75, 255}, RgbColor.invertColor(new int[] {165, 180, 0}));
    }

    @Test
    public void test16() {
        assertArrayEquals(new int[] {90, 75, 238}, RgbColor.invertColor(new int[] {165, 180, 17}));
    }

    @Test
    public void test17() {
        assertArrayEquals(new int[] {90, 75, 221}, RgbColor.invertColor(new int[] {165, 180, 34}));
    }

    @Test
    public void test18() {
        assertArrayEquals(new int[] {90, 75, 204}, RgbColor.invertColor(new int[] {165, 180, 51}));
    }

    @Test
    public void test19() {
        assertArrayEquals(new int[] {90, 75, 187}, RgbColor.invertColor(new int[] {165, 180, 68}));
    }

    @Test
    public void test20() {
        assertArrayEquals(new int[] {90, 75, 170}, RgbColor.invertColor(new int[] {165, 180, 85}));
    }

    @Test
    public void test21() {
        assertArrayEquals(new int[] {90, 75, 153}, RgbColor.invertColor(new int[] {165, 180, 102}));
    }

    @Test
    public void test22() {
        assertArrayEquals(new int[] {255, 255, 255}, RgbColor.invertColor(new int[] {0, 0, 0}));
    }

    @Test
    public void test23() {
        assertArrayEquals(new int[] {255, 255, 238}, RgbColor.invertColor(new int[] {0, 0, 17}));
    }

    @Test
    public void test24() {
        assertArrayEquals(new int[] {255, 255, 221}, RgbColor.invertColor(new int[] {0, 0, 34}));
    }

    @Test
    public void test25() {
        assertArrayEquals(new int[] {255, 255, 204}, RgbColor.invertColor(new int[] {0, 0, 51}));
    }

    @Test
    public void test26() {
        assertArrayEquals(new int[] {255, 255, 187}, RgbColor.invertColor(new int[] {0, 0, 68}));
    }

    @Test
    public void test27() {
        assertArrayEquals(new int[] {15, 5, 102}, RgbColor.invertColor(new int[] {240, 250, 153}));
    }

    @Test
    public void test28() {
        assertArrayEquals(new int[] {15, 5, 85}, RgbColor.invertColor(new int[] {240, 250, 170}));
    }

    @Test
    public void test29() {
        assertArrayEquals(new int[] {15, 5, 68}, RgbColor.invertColor(new int[] {240, 250, 187}));
    }

    @Test
    public void test30() {
        assertArrayEquals(new int[] {15, 5, 51}, RgbColor.invertColor(new int[] {240, 250, 204}));
    }

    @Test
    public void test31() {
        assertArrayEquals(new int[] {15, 5, 34}, RgbColor.invertColor(new int[] {240, 250, 221}));
    }

    @Test
    public void test32() {
        assertArrayEquals(new int[] {15, 5, 17}, RgbColor.invertColor(new int[] {240, 250, 238}));
    }

    @Test
    public void test33() {
        assertArrayEquals(new int[] {0, 0, 0}, RgbColor.invertColor(new int[] {255, 255, 255}));
    }

    @Test
    public void test34() {
        assertArrayEquals(new int[] {15, 75, 119}, RgbColor.invertColor(new int[] {240, 180, 136}));
    }

    @Test
    public void test35() {
        assertArrayEquals(new int[] {15, 75, 102}, RgbColor.invertColor(new int[] {240, 180, 153}));
    }

    @Test
    public void test36() {
        assertArrayEquals(new int[] {15, 75, 85}, RgbColor.invertColor(new int[] {240, 180, 170}));
    }

    @Test
    public void test37() {
        assertArrayEquals(new int[] {15, 75, 68}, RgbColor.invertColor(new int[] {240, 180, 187}));
    }

    @Test
    public void test38() {
        assertArrayEquals(new int[] {15, 75, 51}, RgbColor.invertColor(new int[] {240, 180, 204}));
    }

    @Test
    public void test39() {
        assertArrayEquals(new int[] {15, 75, 34}, RgbColor.invertColor(new int[] {240, 180, 221}));
    }

    @Test
    public void test40() {
        assertArrayEquals(new int[] {15, 75, 17}, RgbColor.invertColor(new int[] {240, 180, 238}));
    }

    @Test
    public void test41() {
        assertArrayEquals(new int[] {15, 65, 255}, RgbColor.invertColor(new int[] {240, 190, 0}));
    }

    @Test
    public void test42() {
        assertArrayEquals(new int[] {15, 65, 238}, RgbColor.invertColor(new int[] {240, 190, 17}));
    }

    @Test
    public void test43() {
        assertArrayEquals(new int[] {15, 65, 221}, RgbColor.invertColor(new int[] {240, 190, 34}));
    }

    @Test
    public void test44() {
        assertArrayEquals(new int[] {15, 65, 204}, RgbColor.invertColor(new int[] {240, 190, 51}));
    }

    @Test
    public void test45() {
        assertArrayEquals(new int[] {15, 65, 187}, RgbColor.invertColor(new int[] {240, 190, 68}));
    }

    @Test
    public void test46() {
        assertArrayEquals(new int[] {15, 65, 170}, RgbColor.invertColor(new int[] {240, 190, 85}));
    }

    @Test
    public void test47() {
        assertArrayEquals(new int[] {15, 65, 153}, RgbColor.invertColor(new int[] {240, 190, 102}));
    }

    @Test
    public void test48() {
        assertArrayEquals(new int[] {15, 65, 136}, RgbColor.invertColor(new int[] {240, 190, 119}));
    }

    @Test
    public void test49() {
        assertArrayEquals(new int[] {15, 65, 119}, RgbColor.invertColor(new int[] {240, 190, 136}));
    }

    @Test
    public void test50() {
        assertArrayEquals(new int[] {15, 65, 102}, RgbColor.invertColor(new int[] {240, 190, 153}));
    }

    @Test
    public void test51() {
        assertArrayEquals(new int[] {15, 65, 85}, RgbColor.invertColor(new int[] {240, 190, 170}));
    }

    @Test
    public void test52() {
        assertArrayEquals(new int[] {15, 65, 68}, RgbColor.invertColor(new int[] {240, 190, 187}));
    }

    @Test
    public void test53() {
        assertArrayEquals(new int[] {15, 65, 51}, RgbColor.invertColor(new int[] {240, 190, 204}));
    }

    @Test
    public void test54() {
        assertArrayEquals(new int[] {15, 65, 34}, RgbColor.invertColor(new int[] {240, 190, 221}));
    }

    @Test
    public void test55() {
        assertArrayEquals(new int[] {15, 65, 17}, RgbColor.invertColor(new int[] {240, 190, 238}));
    }

    @Test
    public void test56() {
        assertArrayEquals(new int[] {15, 55, 255}, RgbColor.invertColor(new int[] {240, 200, 0}));
    }

    @Test
    public void test57() {
        assertArrayEquals(new int[] {15, 55, 238}, RgbColor.invertColor(new int[] {240, 200, 17}));
    }

    @Test
    public void test58() {
        assertArrayEquals(new int[] {15, 55, 221}, RgbColor.invertColor(new int[] {240, 200, 34}));
    }

    @Test
    public void test59() {
        assertArrayEquals(new int[] {15, 55, 204}, RgbColor.invertColor(new int[] {240, 200, 51}));
    }

    @Test
    public void test60() {
        assertArrayEquals(new int[] {15, 55, 187}, RgbColor.invertColor(new int[] {240, 200, 68}));
    }

    @Test
    public void test61() {
        assertArrayEquals(new int[] {15, 55, 170}, RgbColor.invertColor(new int[] {240, 200, 85}));
    }

    @Test
    public void test62() {
        assertArrayEquals(new int[] {15, 55, 153}, RgbColor.invertColor(new int[] {240, 200, 102}));
    }

    @Test
    public void test63() {
        assertArrayEquals(new int[] {15, 55, 136}, RgbColor.invertColor(new int[] {240, 200, 119}));
    }

    @Test
    public void test64() {
        assertArrayEquals(new int[] {15, 55, 119}, RgbColor.invertColor(new int[] {240, 200, 136}));
    }

    @Test
    public void test65() {
        assertArrayEquals(new int[] {15, 55, 102}, RgbColor.invertColor(new int[] {240, 200, 153}));
    }

    @Test
    public void test66() {
        assertArrayEquals(new int[] {15, 55, 85}, RgbColor.invertColor(new int[] {240, 200, 170}));
    }
}