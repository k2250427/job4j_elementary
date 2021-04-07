package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println("is Even: " + isEven(num));
        System.out.println("is Positive: " + isPositive(num));
        System.out.println("is not Even: " + notEven(num));
        System.out.println("is not Positive: " + notPositive(num));
        System.out.println("is not Even And Positive: " + notEvenAndPositive(num));
        System.out.println("is even Or Not Positive: " + evenOrNotPositive(num));
    }
}
