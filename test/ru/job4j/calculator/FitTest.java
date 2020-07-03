package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double height = 180;
        double out = (height - 100) * 1.15;
        double excepted = 92;
        Assert.assertEquals(excepted, out, 0.01);

    }

    @Test
    public void womanWeight() {
        double height = 170;
        double out = (height - 110) * 1.15;
        double excepted = 69;
        Assert.assertEquals(excepted, out, 0.01);
    }
}