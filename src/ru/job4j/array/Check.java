package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            result = data[i] == data[0];
            if (!result) {
                break;
            }
        }
        return result;
    }
}