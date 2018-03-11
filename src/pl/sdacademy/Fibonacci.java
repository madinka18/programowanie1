package pl.sdacademy;

import java.io.Console;
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
    }

