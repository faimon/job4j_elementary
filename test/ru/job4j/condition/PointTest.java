package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void Whenx4y4Andx2y2() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double excepted = 2.82;
        Assert.assertEquals(excepted, out, 0.01);
    }
}