package pl.sdacademy.homework;

import java.util.Scanner;

public class table {
    static Scanner scanner = new Scanner(System.in);
    static int [] newTable = addingNumbersToTheArray();
   static float average;

    public static void main(String[] args) {

        printTable(newTable);
        averageValue();

    }

    private static float averageValue() {
        int sum =0;

        for (int i = 0; i <newTable.length; i++) {
            sum += newTable[i];
            average = (float) (sum /(double) newTable.length);

        }
        System.out.println("średnia arytmetyczna podanej tablicy wynosi: " + average);
        return average;
    }

    private static void printTable(int [] table) {
        StringBuilder nt = new StringBuilder();
        for (int i : table) {
            nt.append(i).append(",");
        }
        System.out.println("Tablica wygląda następująco: " + nt.toString());
    }

    private static int [] addingNumbersToTheArray() {
        System.out.println("Podaj rozmiar tablicy: ");
         int length = scanner.nextInt();
        int [] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Podaj liczbę do tablicy");
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
