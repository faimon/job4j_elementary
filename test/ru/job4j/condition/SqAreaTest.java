package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void Whenp6k2s2() {
        double p = 6;
        double k = 2;
        double out = SqArea.square(6, 2);
        double excepted = 2;
        Assert.assertEquals(excepted, out, 0.01);
    }
}