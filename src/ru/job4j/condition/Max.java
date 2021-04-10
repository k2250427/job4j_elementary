package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return (left > right ? left : right);
    }

    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(b, c, d));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }
}
