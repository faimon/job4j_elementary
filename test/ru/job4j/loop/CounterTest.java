package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void WhenSumByEvenOneToTen() {
        int result = Counter.sumByEven(1, 10);
        int excepted = 30;
        assertThat(result, is(excepted));
    }

    @Test
    public void WhenSumByEvenZeroToFour() {
        int result = Counter.sumByEven(0, 4);
        int excepted = 6;
        assertThat(result, is(excepted));
    }
}