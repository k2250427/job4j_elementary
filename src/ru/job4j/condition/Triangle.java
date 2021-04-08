package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ac + bc > ab && ab + bc > ac);
    }

    public static void main(String[] args) {
        double ab = 3;
        double ac = 4;
        double bc = 5;
        System.out.println(" ab = " + ab + ", ac = " + ac + ", bc = " + bc + ", exist = " + exist(ab, ac, bc));
    }
}
