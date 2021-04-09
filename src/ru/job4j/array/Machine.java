package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int rest = money - price;
        int ct = 0;
        while (rest > 0) {
            if (rest >= coins[ct]) {
                int qty = rest / coins[ct]; // кратность текущей монеты
                for (int i = 0; i < qty; i++) {
                    rsl[size++] = coins[ct];
                }
                rest -= coins[ct] * qty;
                ct++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
