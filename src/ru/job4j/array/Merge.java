package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int k = 0;
        for (int c = 0; c < rsl.length; c++) {
            if (k >= right.length || i < left.length && left[i] <= right[k]) {
                rsl[c] = left[i];
                i++;
            } else if (i >= left.length || k < right.length && left[i] > right[k]) {
                rsl[c] = right[k];
                k++;
            }
        }
        return rsl;
    }
}
