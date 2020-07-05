package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void WhenOneNegative() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void WhenAllNegative() {
        int[][] in = {
                {-3, -2, -10},
                {-1111, -1, -5}
        };
        int[][] expect = {
                {0, 0, 0},
                {0, 0, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}