package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void When1Year() {
        assertThat(Mortgage.year(1000, 2000, 1), is(1));
    }

    @Test
    public void When2Year() {
        assertThat(Mortgage.year(100, 120, 50), is(2));
    }

    @Test
    public void When3Year() {
        assertThat(Mortgage.year(100, 60, 30), is(3));
    }
}