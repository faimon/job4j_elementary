package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[] {5, 1, 4, 9};
        assertThat(FindLoop.indexOf(input, 5), is(0));
    }

    @Test
    public void whenArrayHasNotFindElement() {
        int[] input = new int[] {5, 1, 4, 9};
        assertThat(FindLoop.indexOf(input, 2), is(-1));
    }
}