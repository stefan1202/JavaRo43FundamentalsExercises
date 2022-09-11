package ro.sda.javaro43.solo_w4.task139;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class RhythmTest {
    @Test
    public void test01() {
        assertEquals(true, Rhythm.hasSyncopation(".#.#.#.#"));
    }

    @Test
    public void test02() {
        assertEquals(false, Rhythm.hasSyncopation("#.#...#."));
    }

    @Test
    public void test03() {
        assertEquals(true, Rhythm.hasSyncopation("#.#.###."));
    }

    @Test
    public void test04() {
        assertEquals(false, Rhythm.hasSyncopation(".."));
    }

    @Test
    public void test05() {
        assertEquals(false, Rhythm.hasSyncopation(""));
    }

    @Test
    public void test06() {
        assertEquals(true, Rhythm.hasSyncopation("##"));
    }

    @Test
    public void test07() {
        assertEquals(true, Rhythm.hasSyncopation("####...."));
    }

    @Test
    public void test08() {
        assertEquals(false, Rhythm.hasSyncopation("#"));
    }

    @Test
    public void test09() {
        assertEquals(true, Rhythm.hasSyncopation(".#.#...."));
    }

    @Test
    public void test10() {
        assertEquals(true, Rhythm.hasSyncopation(".#.#"));
    }

    @Test
    public void test11() {
        assertEquals(true, Rhythm.hasSyncopation(".#."));
    }

    @Test
    public void test12() {
        assertEquals(false, Rhythm.hasSyncopation("#."));
    }

    @Test
    public void test13() {
        assertEquals(true, Rhythm.hasSyncopation(".#"));
    }
}