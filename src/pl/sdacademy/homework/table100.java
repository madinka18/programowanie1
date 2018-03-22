package pl.sdacademy.homework;

import java.util.Arrays;
import java.util.Random;

public class table100 {

    private static int[] table1 = fillingTheBoard();

    public static void main(String[] args) {
        printTable(table1);
        countingOccurrencesOfNumbers();

    }

    private static void countingOccurrencesOfNumbers() {
        int suma = 0;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;
        int suma6 = 0;
        int suma7 = 0;
        int suma8 = 0;
        int suma9 = 0;
        int suma10 = 0;
        int suma11 = 0;
        int suma12 = 0;
        int suma13 = 0;
        int suma14 = 0;
        int suma15 = 0;
        int suma16 = 0;
        int suma17 = 0;
        int suma18 = 0;
        int suma19 = 0;
        Arrays.sort(table1);
        System.out.println("Posortowana tablica wygląda następująco: " + Arrays.toString(table1));

        for (int aTable1 : table1) {
            if (aTable1 == 0) {
                suma++;
            } else if (aTable1 == 1) {
                suma1++;

            } else if (aTable1 == 2) {
                suma2++;

            } else if (aTable1 == 3) {
                suma3++;

            } else if (aTable1 == 4) {
                suma4++;

            } else if (aTable1 == 5) {
                suma5++;

            } else if (aTable1 == 6) {
                suma6++;

            } else if (aTable1 == 7) {
                suma7++;

            } else if (aTable1 == 8) {
                suma8++;

            } else if (aTable1 == 9) {
                suma9++;

            } else if (aTable1 == 10) {
                suma10++;

            } else if (aTable1 == 11) {
                suma11++;

            } else if (aTable1 == 12) {
                suma12++;

            } else if (aTable1 == 13) {
                suma13++;

            } else if (aTable1 == 14) {
                suma14++;

            } else if (aTable1 == 15) {
                suma15++;

            } else if (aTable1 == 16) {
                suma16++;

            } else if (aTable1 == 17) {
                suma17++;

            } else if (aTable1 == 18) {
                suma18++;

            } else {
                suma19++;
            }
        }
            System.out.println("Liczba 0 występuje " + suma + " razy"+"\nLiczba 1 występuje " + suma1 + " razy"
            +"\nLiczba 2 występuje " + suma2 + " razy" +"\nLiczba 3 występuje " + suma3 + " razy"
            +"\nLiczba 4 występuje " + suma4 + " razy" + "\nLiczba 5 występuje " + suma5 + " razy"
            +"\nLiczba 6 występuje " + suma6 + " razy"+"\nLiczba 7 występuje " + suma7 + " razy"
            +"\nLiczba 8 występuje " + suma8 + " razy"+"\nLiczba 9 występuje " + suma9 + " razy"
            +"\nLiczba 10 występuje " + suma10 + " razy"+"\nLiczba 11 występuje " + suma11 + " razy"
            +"\nLiczba 12 występuje " + suma12 + " razy"+"\nLiczba 13 występuje " + suma13 + " razy"
            +"\nLiczba 14 występuje " + suma14 + " razy"+"\nLiczba 15 występuje " + suma15 + " razy"
            +"\nLiczba 16 występuje " + suma16 + " razy"+"\nLiczba 17 występuje " + suma17 + " razy"
            +"\nLiczba 18 występuje " + suma18 + " razy"+"\nLiczba 19 występuje " + suma19 + " razy");


    }
        private static void printTable ( int[] table){
            StringBuilder nt = new StringBuilder();
            for (int i : table) {
                nt.append(i).append(",");
            }
            System.out.println("Tablica wygląda następująco: " + nt.toString());
        }

        private static int[] fillingTheBoard(){
            Random r = new Random();
            int[] rettab = new int[100];
            for (int i = 0; i < rettab.length; i++) {
                rettab[i] = r.nextInt(20);
            }
            return rettab;
        }

    }
