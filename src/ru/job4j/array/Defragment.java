package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                boolean flag = false;
                int i;
                for (i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    array[index] = array[i];
                    array[i] = null;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
