package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortFiveNumbers() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] input = new int[] {10, 11, 27};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {10, 11, 27};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortTwoNumbers() {
        int[] input = new int[] {15, 10};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {10, 15};
        assertThat(result, is(expect));
    }
}