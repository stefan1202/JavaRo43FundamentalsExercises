package ro.sda.javaro43.solo_w2.task58;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void contains_spaces_tests() {
        System.out.println("Should work for strings containing spaces.");
        assertEquals(true, Challenge.hasSpaces("Foo bar"));
        assertEquals(true, Challenge.hasSpaces("Foo "));
        assertEquals(true, Challenge.hasSpaces(" Foo"));
        assertEquals(true, Challenge.hasSpaces(" "));
    }

    @Test
    public void no_spaces_test() {
        System.out.println("Should work for strings without spaces.");
        assertEquals(false, Challenge.hasSpaces("Foo"));
    }

    @Test
    public void empty_string_test() {
        System.out.println("Should work for empty strings.");
        assertEquals(false, Challenge.hasSpaces(""));
    }

    @Test
    public void special_chars_test() {
        System.out.println("Should work for special characters.");
        assertEquals(false, Challenge.hasSpaces(",./;'[]-="));
    }
}