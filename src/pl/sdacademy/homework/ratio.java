package pl.sdacademy.homework;

import java.util.Scanner;

public class ratio {
    private static Scanner scanner = new Scanner(System.in);
    private static int ratio = 1;

    public static void main(String[] args) {
        calculationOfTheRatio();

    }

    private static void calculationOfTheRatio() {
        int i;
        System.out.println("Podaj ilość liczb do działania: ");
        int numberOfNambers = scanner.nextInt();
        do {
            for (i = 0; i < numberOfNambers; i++) {
                System.out.println("Podaj liczbę: ");
                int usersNumers = scanner.nextInt();

                if (usersNumers == 0) {
                    System.out.println("Podaj liczbę różną od zera");
                    i--;

                } else {
                    ratio *= usersNumers;
                }
            }

        }  while (i < numberOfNambers);

        System.out.println("Iloczyn podanych liczb wynosi: " + ratio);
    }
}