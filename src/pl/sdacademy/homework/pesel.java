package pl.sdacademy.homework;

import java.util.Scanner;

public class pesel {
    private static Scanner scanner = new Scanner(System.in);
    private static long pesel;
    private static long number11, number10, number9, number8, number7, number6, number5, number4, number3, number2, number1;

    public static void main(String[] args) {
        loadingOfData();
        writingNumbers();
        validation();
    }

    private static void validation() {
        long sum = (number1) + (number2*3)+(number3*7)+(number4*9) + (number5) + (number6*3) + (number7*7) + (number8*9) + (number9) + (number10*3);
        long ratio = sum%10;
        long result;
        if(ratio > 0){
            result = 10 - ratio;

        } else { result = ratio;
        }

        if (result == number11){
            System.out.println("Numer PESEL jest poprawny.");
        } else {
            System.out.println("Numer PESEL jest niepoprawny.");
        }
    }

    private static void writingNumbers() {
        number11 += pesel%10;
        pesel/=10;

        number10 += pesel%10;
        pesel/=10;

       number9 += pesel%10;
        pesel/=10;

        number8 += pesel%10;
        pesel/=10;

        number7 += pesel%10;
        pesel/=10;

        number6 += pesel%10;
        pesel/=10;

        number5 += pesel%10;
        pesel/=10;

        number4 += pesel%10;
        pesel/=10;

        number3 += pesel%10;
        pesel/=10;

        number2 += pesel%10;
        pesel/=10;

        number1 += pesel%10;
        pesel/=10;
    }

    private static void loadingOfData() {
        System.out.println("Podaj PESEL: ");
        pesel = scanner.nextLong();
    }

}
