package pl.sdacademy.homework;

import java.util.Random;

public class sum {
    private static int drawnNumber = 10;
    public static void main(String[] args) {
        drawingOfNaturalNumber();
        countingNumbers();
    }

    private static void countingNumbers() {
        int sum = 0;
        while (drawnNumber != 0){
            sum += drawnNumber%10;
            drawnNumber = drawnNumber / 10;
        }
        System.out.println("Suma cyfr wylosowanej liczby wynosi: " + sum);
    }

    private static void drawingOfNaturalNumber() {
        Random r = new Random();
        drawnNumber = r.nextInt(100000);
        System.out.println("Wylosowana liczba naturalna to: " + drawnNumber);

    }

}
