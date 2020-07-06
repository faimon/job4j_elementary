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

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 1);
        assertThat(result, is(false));
    }
}