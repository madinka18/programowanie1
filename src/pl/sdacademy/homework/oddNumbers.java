package pl.sdacademy.homework;

import java.util.Scanner;

public class oddNumbers {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        writingOutOddNumbers();

    }

    private static void writingOutOddNumbers() {
        System.out.println("Podaj górną granicę(liczbę) dla wypisania liczb nieparzystych: ");
        int upperLimit = scanner.nextInt();
        System.out.println("Liczby nieparzyste w zakresie od 0 do " + upperLimit + " są natępujące:");
        for (int i = 0; i <= upperLimit; i++)
            if (i%2 == 1) {

                System.out.print(i + ", ");
            }
    }
    }

