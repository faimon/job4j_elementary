package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        double x1 = 4;
        double y1 = 4;
        double x2 = 2;
        double y2 = 2;
        double out = Math.sqrt(Math.pow(x2 - x1, 2) +  Math.pow(y2 - y1, 2));
        double excepted = 2.82;
        Assert.assertEquals(excepted, out, 0.01);
    }
}