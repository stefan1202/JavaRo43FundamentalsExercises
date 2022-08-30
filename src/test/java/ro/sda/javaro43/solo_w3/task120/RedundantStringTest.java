package ro.sda.javaro43.solo_w3.task120;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RedundantStringTest {
    @Test
    public void test01() {
        assertEquals("TeshaTesha", RedundantString.repeatString("Tesha", 2));
    }

    @Test
    public void test02() {
        assertEquals("DeepDeepDeep", RedundantString.repeatString("Deep", 3));
    }

    @Test
    public void test03() {
        assertEquals("MattMattMattMatt", RedundantString.repeatString("Matt", 4));
    }

    @Test
    public void test04() {
        assertEquals("Not a string!", RedundantString.repeatString(2000, 7));
    }

    @Test
    public void test05() {
        assertEquals("***", RedundantString.repeatString("*", 3));
    }

    @Test
    public void test06() {
        assertEquals("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello", RedundantString.repeatString("Hello", 11));
    }

    @Test
    public void test07() {
        assertEquals("544466654446665444666544466654446665444666544466654446665444666544466654446665444666", RedundantString.repeatString("5444666", 12));
    }

    @Test
    public void test08() {
        assertEquals("Not a string!", RedundantString.repeatString(new Object[] {}, 3));
    }

    @Test
    public void test09() {
        assertEquals("Not a string!", RedundantString.repeatString(new Object[] {}, 6));
    }

    @Test
    public void test10() {
        assertEquals("Not a string!", RedundantString.repeatString(24, 3));
    }

    @Test
    public void test11() {
        assertEquals("Not a string!", RedundantString.repeatString(true, 3));
    }

    @Test
    public void test12() {
        assertEquals("", RedundantString.repeatString("Hello", 0));
    }
}
// credit goes to the original author/publisher @Mubashir Hassan