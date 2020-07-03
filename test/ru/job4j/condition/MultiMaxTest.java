package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSixMax() {
        int result = MultiMax.max(6, 3, 1);
        assertThat(result, is(6));
    }

    @Test
    public void whenNineMax() {
        int result = MultiMax.max(4, 5, 9);
        assertThat(result, is(9));
    }
    
    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }

}