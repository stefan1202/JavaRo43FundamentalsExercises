package ro.sda.javaro43.solo_w2_co2.task104;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class TrueOnesFalseZeroesTest {

    @Test
    public void test01() {
        assertEquals(true, Arrays.equals(new boolean[] {true, false, false, true, false, true}, TrueOnesFalseZeroes.integerBoolean("100101")));
    }

    @Test
    public void test02() {
        assertEquals(true, Arrays.equals(new boolean[] {false, false, true}, TrueOnesFalseZeroes.integerBoolean("001")));
    }

    @Test
    public void test03() {
        assertEquals(true, Arrays.equals(new boolean[] {}, TrueOnesFalseZeroes.integerBoolean("")));
    }

    @Test
    public void test04() {
        assertEquals(true, Arrays.equals(new boolean[] {true, true, true}, TrueOnesFalseZeroes.integerBoolean("111")));
    }

    @Test
    public void test05() {
        assertEquals(true, Arrays.equals(new boolean[] {false, false, false}, TrueOnesFalseZeroes.integerBoolean("000")));
    }

    @Test
    public void test06() {
        assertEquals(true, Arrays.equals(new boolean[] {true, false, false, true, false, true, true, false}, TrueOnesFalseZeroes.integerBoolean("10010110")));
    }

    @Test
    public void test07() {
        assertEquals(true, Arrays.equals(new boolean[] {false, true, true, false, true}, TrueOnesFalseZeroes.integerBoolean("01101")));
    }

    @Test
    public void test08() {
        assertEquals(true, Arrays.equals(new boolean[] {false, true, false, true, true, false}, TrueOnesFalseZeroes.integerBoolean("010110")));
    }

    @Test
    public void test09() {
        assertEquals(true, Arrays.equals(new boolean[] {false, true, true, false}, TrueOnesFalseZeroes.integerBoolean("0110")));
    }

}
// end of tests