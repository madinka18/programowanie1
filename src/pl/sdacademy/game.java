package pl.sdacademy;

import java.util.Random;
import java.util.Scanner;

public class game {
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