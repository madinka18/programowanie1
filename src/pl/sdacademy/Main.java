package pl.sdacademy;

import java.util.Random;

public class Main {

    static int rows = 6;
    static String[][] board = new String[rows][];

    public static void main(String[] args) {
        tringle();
        line();
    }


    public static void tringle() {
        int height = 6;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j <= i) {
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }

    public static void line() {
        System.out.println("");
        int height = 6;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j) System.out.print("*");
                else System.out.print(" ");

            }

            System.out.println();
        }
    }
}