package pl.sdacademy;

import java.util.Random;
import java.util.Scanner;

public class ruletka {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    rouletteGame();
    }
    public static void rouletteGame(){
        Random random = new Random();
        int i = random.nextInt(36);
        System.out.println(i);
    }

}
