package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void WhenAllTrue() {
        boolean[] input = new boolean[]{true, true, true, true};
        assertThat(Check.mono(input), is(true));
    }

    @Test
    public void WhenOneFalseOtherTrue() {
        boolean[] input = new boolean[]{true, true, true, false};
        assertThat(Check.mono(input), is(false));
    }

    @Test
    public void WhenAllFalse() {
        boolean[] input = new boolean[]{false, false, false, false};
        assertThat(Check.mono(input), is(true));
    }
}