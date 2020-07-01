package ru.job4j.calculate;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class X2Test {

    @Test
    public void whenABCXone() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int excepted = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(excepted));
    }

    @Test
    public void whenAzero() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int excepted = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(excepted));
    }

    @Test
    public void whenCzero() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int excepted = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(excepted));
    }

    @Test
    public void whenXzero() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int excepted = 1;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(excepted));
    }
}