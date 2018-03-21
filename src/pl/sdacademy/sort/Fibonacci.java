package pl.sdacademy.sort;

import java.util.Random;
import java.util.Scanner;

public class Fibonacci {

   public static int fibonacci (int i){
       if (i == 0)
           return 0;
       else if ((i == 1) || (i == 2))
            return 1;
        else
            return fibonacci(i-1) + fibonacci(i-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj indeks ciągu fibonacciego");
        int i = scanner.nextInt();

            System.out.println( i + ": " + fibonacci(i));
    }
        //pobierz indeks elementu ciągu

        //wywołaj funkcję fibonaci i wyświetl wynik

    public static class game {
        public static void main(String[] args) {
            Random generator = new Random();
            int value = generator.nextInt(100);

            int counter = 0;
            while (counter < 10) {

                System.out.println("Zgadnij liczbę z zakresu od 0 do 100");
                Scanner scanner = new Scanner(System.in);
                int in = scanner.nextInt();
                if (in == value) {
                    System.out.println("Brawo to była prawidłowa liczba! Ilość prób: " + counter);
                    return;
                } else if (in < value) {
                    System.out.println("Twoja liczba jest mniejsza niż wylosowana");

                } else if (in > value) {
                    System.out.println("Twoja liczba jest większa niż wylosowana");
                }
                counter++;
            }
        }
    }

    public static class Main {

        static int rows = 6;
        static String[][] board = new String[rows][];

        public static void main(String[] args) {
            tringle();
            line();
            rectangle();
            crossingLines();
        }

        public static void crossingLines() {
            System.out.println("");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (j==i || j==(5-i)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }

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

        public static void rectangle() {
            System.out.println("");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (i == 0 || j == 0 || j == 5 || i == 5)
                        System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}

