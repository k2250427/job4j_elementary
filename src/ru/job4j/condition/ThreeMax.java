package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int third = 3;
        System.out.println("first = " + first + ", second = " + second + ", third = " + third + ", max = "
                + max(first, second, third));
    }
}
