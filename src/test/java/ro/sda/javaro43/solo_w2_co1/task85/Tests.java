package ro.sda.javaro43.solo_w2_co1.task85;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class Tests {
    @Test
    public void test1() {
        assertThat(Challenge.MultiplyByLength(new int[]{2,6,4,9}), is(new int[]{8,24,16,36}));
    }

    @Test
    public void test2() {
        assertThat(Challenge.MultiplyByLength(new int[]{4,1,1}), is(new int[]{12,3,3}));
    }

    @Test
    public void test3() {
        assertThat(Challenge.MultiplyByLength(new int[]{1,0,3,3,7,2,1}), is(new int[]{7,0,21,21,49,14,7}));
    }

    @Test
    public void test4() {
        assertThat(Challenge.MultiplyByLength(new int[]{0}), is(new int[]{0}));
    }
}