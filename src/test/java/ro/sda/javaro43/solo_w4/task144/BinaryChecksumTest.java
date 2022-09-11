package ro.sda.javaro43.solo_w4.task144;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinaryChecksumTest {

    @Test
    public void test01() {
        assertEquals("01011010", BinaryChecksum.addParityBit("0101101"));
    }

    @Test
    public void test02() {
        assertEquals("01100000", BinaryChecksum.addParityBit("0110000"));
    }

    @Test
    public void test03() {
        assertEquals("00101101", BinaryChecksum.addParityBit("0010110"));
    }

    @Test
    public void test04() {
        assertEquals("11000000", BinaryChecksum.addParityBit("1100000"));
    }

    @Test
    public void test05() {
        assertEquals("11111111", BinaryChecksum.addParityBit("1111111"));
    }

    @Test
    public void test06() {
        assertEquals("11110110", BinaryChecksum.addParityBit("1111011"));
    }

    @Test
    public void test07() {
        assertEquals("10101100", BinaryChecksum.addParityBit("1010110"));
    }

    @Test
    public void test08() {
        assertEquals("11001100", BinaryChecksum.addParityBit("1100110"));
    }

    @Test
    public void test09() {
        assertEquals("10101100", BinaryChecksum.addParityBit("1010110"));
    }

    @Test
    public void test10() {
        assertEquals("10110111", BinaryChecksum.addParityBit("1011011"));
    }

    @Test
    public void test11() {
        assertEquals("00101101", BinaryChecksum.addParityBit("0010110"));
    }

    @Test
    public void test12() {
        assertEquals("11001010", BinaryChecksum.addParityBit("1100101"));
    }

    @Test
    public void test13() {
        assertEquals("10000001", BinaryChecksum.addParityBit("1000000"));
    }

    @Test
    public void test14() {
        assertEquals("10101111", BinaryChecksum.addParityBit("1010111"));
    }

}
