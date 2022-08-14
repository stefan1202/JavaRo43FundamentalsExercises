package ro.sda.javaro43.Task14;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NameTests {
    @Test
    public void test01() {
        assertEquals( "MubashirEdabit",Program.nameString("Mubashir"));
    }

    @Test
    public void test02() {
        assertEquals("MattEdabit",Program.nameString("Matt") );
    }

    @Test
    public void test03() {
        assertEquals("javaEdabit",Program.nameString("java"));
    }
    @Test
    public void test04() {
        assertEquals("AirforceEdabit",Program.nameString("Airforce"));
    }
}