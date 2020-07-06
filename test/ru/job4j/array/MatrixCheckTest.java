package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void WhenCheckFirstRow() {
        char[][] input = {
                {'X', 'X', 'W'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        assertThat(MatrixCheck.monoHorizontal(input, 0), is(false));
    }

    @Test
    public void WhenCheckSecondRow() {
        char[][] input = {
                {'X', 'X', 'W'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        assertThat(MatrixCheck.monoHorizontal(input, 1), is(true));
    }
}