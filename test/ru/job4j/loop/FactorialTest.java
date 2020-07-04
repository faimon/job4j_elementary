package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Assert.assertEquals(120, Factorial.calc(5));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Assert.assertEquals(1, Factorial.calc(0));
    }
}