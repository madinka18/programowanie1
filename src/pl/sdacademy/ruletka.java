package pl.sdacademy;

import java.util.Random;
import java.util.Scanner;

public class ruletka {
    static Scanner scanner = new Scanner(System.in);
    static int field;
    static int cash = 1000;

    public static void main(String[] args) {
        rouletteGame();
        betAmount();


    }


    public static boolean rouletteGame() {

        do {
            int drawn = drawnNumber();
            if (drawn % 2 == 0 && field == 2) {
                System.out.println("Wygrałeś zakład, wylosowana liczba to: " + drawn);
                return true;
            } else if (drawn % 2 == 1 && field == 1) {
                System.out.println("Wygrałeś zakład, wylosowana liczba to: " + drawn);
                return true;
            } else if (drawn % 2 == 0 && field == 1 || drawn %2 == 1 && field == 2) {
                System.out.println("Przegrałeś zakład, wylosowana liczba to: " + drawn);
                return false;
            } else {
                System.out.println();
                return false;
            }
        } while ( betAmount() > 0);



    }

    public static int drawnNumber() {
        Random random = new Random();
        int number = random.nextInt(36);
        return number;

    }

    public static int betAmount() {

        while (cash > 0) {
            System.out.println("Podaj kwotę jaką chcesz obstawić, masz do dyspozycji: " + cash + " zł");
            int amount = scanner.nextInt();
            System.out.println("Jakie pole chcesz obstawić:  czarne nieparzyste: 1, czerwone parzyste: 2");
            field = scanner.nextInt();

            if (rouletteGame() == true) {
                cash = cash + (amount * 2);
            } else {
                cash = cash - (amount * 2);
            }

        }
        System.out.println("Koniec gry");
        return cash;
    }
}