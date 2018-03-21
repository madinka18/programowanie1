package pl.sdacademy.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class sortowanie {


    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    generateNumbersInList(list, 10);
    System.out.println("Lista nie przed sortowaniem " + list);
    list =  bubbleSort(list);
    System.out.println("Lista po sortowaniu " + list);

    }

    private static void generateNumbersInList(List<Integer> list, int j) {
        Random random = new Random();
        for (int i = 0; i < j; i++) {
            list.add(random.nextInt(100));
        }
    }

    private static void displayTable(int[] array) {
        Arrays.stream(array).forEach(i -> {

        });
    }

    private static List<Integer> bubbleSort(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());


    /*     for (int j = 0; j < list.size() - 1; j++) {
            for (int i = 0; i < list.size() - 1; i++)
                if (list.get(i) > list.get(i + 1)) {
                int tmp = list.get(i);
                list.set(i, list.get(i + 1));
                 list.set(i + 1, tmp);
                }
        }



    }*/

    }

}