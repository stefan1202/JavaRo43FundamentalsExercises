package ro.sda.javaro43.solo_w2.task54;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SandwichesTests {

    @Test
    public void test01() {
        assertEquals(Sandwiches.hasSameBread(
                        new String[]{"white bread", "lettuce", "white bread"},
                        new String[]{"white bread", "tomato", "white bread"}),
                true
        );
    }

    @Test
    public void test02() {
        assertEquals(Sandwiches.hasSameBread(
                        new String[] {"brown bread", "chicken", "brown bread"},
                        new String[] {"white bread", "chicken", "white bread"}),
                false
        );
    }

    @Test
    public void test03() {
        assertEquals(Sandwiches.hasSameBread(
                        new String[]{"toast", "cheese", "toast"},
                        new String[]{"brown bread", "cheese", "toast"}),
                false
        );
    }

    @Test
    public void test04() {
        assertEquals(Sandwiches.hasSameBread(
                        new String[]{"white bread", "lettuce", "toast"},
                        new String[]{"white bread", "tomato", "toast"}),
                true
        );
    }

    @Test
    public void test05() {
        assertEquals(Sandwiches.hasSameBread(
                        new String[]{"white bread", "lettuce", "toast"},
                        new String[]{"brown bread", "tomato", "toast"}),
                false
        );
    }

    @Test
    public void test06() {
        assertEquals(Sandwiches.hasSameBread(
                        new String[]{"white bread", "lettuce", "brown bread"},
                        new String[]{"brown bread", "tomato", "white bread"}),
                false
        );
    }

    @Test
    public void test07() {
        assertEquals(Sandwiches.hasSameBread(
                        new String[]{"white bread", "lettuce", "brown bread"},
                        new String[]{"white bread", "tomato", "white bread"}),
                false
        );
    }

}