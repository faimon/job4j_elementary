package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double p = 6;
        double k = 2;
        double h = p / (2 * (k + 1));
        double l = h * k;
        double out = l * h;
        double excepted = 2;
        Assert.assertEquals(excepted, out, 0.01);
    }
}