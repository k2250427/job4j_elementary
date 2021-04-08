package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] m: array) {
            for (int n: m) {
                rsl += n;
            }
        }
        return rsl;
    }
}
