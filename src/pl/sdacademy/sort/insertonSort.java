package pl.sdacademy.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class insertonSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        sortingList(list);
        System.out.println("Lista przed posortowaniem " + list);
        list = sortedList(list);
        System.out.println("Lista po sortowaniu       " + list);
    }

    private static List<Integer> sortedList(List<Integer> list) {
       for (int j = 0; j < list.size(); j++)
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(j)) {
                int tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
            }
        }
   /*         for (int i = 1; i < list.size(); i++) {
                if (list.get(1) > list.get(i)) {
                    int tmp = list.get(1);

                    list.set(1, list.get(i));
                    list.set(i, tmp);
                }
            }

            for (int i = 2; i < list.size(); i++) {
                if (list.get(2) > list.get(i)) {
                    int tmp = list.get(2);

                    list.set(2, list.get(i));
                    list.set(i, tmp);
                }

            } for (int i = 3; i < list.size(); i++) {
                if (list.get(3) > list.get(i)) {
                    int tmp = list.get(3);

                    list.set(3, list.get(i));
                    list.set(i, tmp);
                }


            }for (int i = 4; i < list.size(); i++) {
                if (list.get(4) > list.get(i)) {
                    int tmp = list.get(4);

                    list.set(4, list.get(i));
                    list.set(i, tmp);
                }
            }for (int i = 5; i < list.size(); i++) {
                if (list.get(5) > list.get(i)) {
                    int tmp = list.get(5);

                    list.set(5, list.get(i));
                    list.set(i, tmp);

                }
            }for (int i =   6; i < list.size(); i++) {
            if (list.get(6) > list.get(i)) {
                int tmp = list.get(6);

                list.set(6, list.get(i));
                list.set(i, tmp);
            }
        }for (int i =   7; i < list.size(); i++) {
            if (list.get(7) > list.get(i)) {
                int tmp = list.get(7);

                list.set(7, list.get(i));
                list.set(i, tmp);
            }
        }for (int i =   8; i < list.size(); i++) {
            if (list.get(8) > list.get(i)) {
                int tmp = list.get(8);

                list.set(8, list.get(i));
                list.set(i, tmp);
            }
        }for (int i = 9; i < list.size(); i++) {
            if (list.get(9) > list.get(i)) {
                int tmp = list.get(9);

                list.set(9, list.get(i));
                list.set(i, tmp);
            }
        }*/
        return list;
    }
        private static void sortingList(List<Integer> list){
            Random random = new Random();
            for (int i = 0; i < 10; i++)
                list.add(random.nextInt(20));

        }

    }
