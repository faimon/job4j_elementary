package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void WhenStartwithHelloThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        assertThat(ArrayChar.startsWith(word, pref), is(true));
    }

    @Test
    public void WhenStartwithHelloThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'f'};
        assertThat(ArrayChar.startsWith(word, pref), is(false));
    }
}