package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        int in = 140;
        int excepted = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(excepted, out);
    }

    @Test
    public void whenConvert180rubleThen3Dollar() {
        int in = 180;
        int excepted = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(excepted, out);
    }
}