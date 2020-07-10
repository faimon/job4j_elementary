package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0, rightPoint = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftPoint < left.length && rightPoint < right.length) {
                if (left[leftPoint] < right[rightPoint]) {
                    rsl[i] = left[leftPoint++];
                } else {
                    rsl[i] = right[rightPoint++];
                }
            }   else if (leftPoint == left.length) {
                    rsl[i]= right[rightPoint++];
                }
                else {
                    rsl[i] = left[leftPoint++];
                }
        }
        return rsl;
    }
}
