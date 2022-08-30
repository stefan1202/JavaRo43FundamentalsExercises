package ro.sda.javaro43.solo_w2_co1.task89;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CharBetweenWordsTest {
    @Test
    public void test01() {
        assertEquals("I❤love❤Tesh!", CharBetweenWords.add("❤", "I love Tesh!"));
    }

    @Test
    public void test02() {
        assertEquals("Java👍is👍a👍lot👍of👍fun.", CharBetweenWords.add("👍", "Java is a lot of fun."));
    }

    @Test
    public void test03() {
        assertEquals("Hello😊world!", CharBetweenWords.add("😊", "Hello world!"));
    }

    @Test
    public void test04() {
        assertEquals("you&me&world", CharBetweenWords.add("&", "you me world"));
    }

    @Test
    public void test05() {
        assertEquals("hash#or#pound#sign#and#symbol", CharBetweenWords.add("#", "hash or pound sign and symbol"));
    }

    @Test
    public void test06() {
        assertEquals("replaceAll()-replace()-or-String.join-methods", CharBetweenWords.add("-", "replaceAll() replace() or String.join methods"));
    }
}