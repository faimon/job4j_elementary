package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean equals = left[left.length - 1] == right[right.length - 1];
        return equals;
    }
}
