package pl.sdacademy.homework;

import java.util.Scanner;

public class cube {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        calculationOfTheCube();
    }
        public static void calculationOfTheCube(){
            System.out.println("Podaj liczbę rzeczywistą do wyliczenia szcześciana:");
            int realNumber = scanner.nextInt();
            int cube;
            cube = realNumber * realNumber * realNumber;
            System.out.println("Szcześcian z podanej liczby wynosi: " + cube);
    }
}
