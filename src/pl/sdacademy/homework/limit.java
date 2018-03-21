package pl.sdacademy.homework;

import java.util.Scanner;

public class limit {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addingNumbers();
    }

    private static void addingNumbers() {
        int limit;
        int sum = 0;
        int i;
        System.out.println("Podaj liczbę określającą limit dodawania");
        limit = scanner.nextInt();

        for ( i = 0; i <= limit; i++){
            if (sum <= limit-1){
            System.out.println("Podaj liczbę dodatnią: ");
            int numer = scanner.nextInt();
            sum += numer;

        } else {

                break;
            }
        }
        System.out.println("Otrzymana suma to " + sum);
        System.out.println("Ilość dodanych do siebie liczb wynosi: " + i);
    }
}

