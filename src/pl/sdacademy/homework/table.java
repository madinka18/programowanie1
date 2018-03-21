package pl.sdacademy.homework;

import java.util.Scanner;

public class table {
    private static Scanner scanner = new Scanner(System.in);
    private static int [] newTable = addingNumbersToTheArray();
   private static float average;

    public static void main(String[] args) {

        printTable(newTable);
        averageValue();

    }

    private static void averageValue() {
        int sum =0;

        for (int aNewTable : newTable) {
            sum += aNewTable;
            average = (sum / (float) newTable.length);

        }
        System.out.println("średnia arytmetyczna podanej tablicy wynosi: " + average);
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
