package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        if (x1 >= 0 && x1 <= 7 && y1 >= 0 && y1 <= 7
            && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7
            && dx == dy) {
            rsl = dx;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        System.out.println(" start = (" + x1 + "," + y1 + "), finish = (" + x2 + "," + y2 + "), way = " + way(x1, y1, x2, y2));
    }
}
