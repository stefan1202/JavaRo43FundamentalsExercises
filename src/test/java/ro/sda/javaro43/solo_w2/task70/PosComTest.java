package ro.sda.javaro43.solo_w2.task70;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PosComTest {
    @Test
    public void basicTests() {
        assertEquals(32, Program.posCom(5));
        assertEquals(16, Program.posCom(4));
        assertEquals(8, Program.posCom(3));
        assertEquals(4, Program.posCom(2));
        assertEquals(2, Program.posCom(1));
        assertEquals(64, Program.posCom(6));
        assertEquals(128, Program.posCom(7));
        assertEquals(256, Program.posCom(8));
        assertEquals(512, Program.posCom(9));
        assertEquals(1024, Program.posCom(10));
        assertEquals(33554432, Program.posCom(25));
    }
}