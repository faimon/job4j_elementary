package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight180() {
        double out = Fit.manWeight((short) 180);
        double excepted = 92;
        Assert.assertEquals(excepted, out, 0.01);

    }

    @Test
    public void whenWomanHeight170() {
        double out = Fit.womanWeight((short) 170);
        double excepted = 69;
        Assert.assertEquals(excepted, out, 0.01);
    }
}