package ru.otus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        final int lenght = 100000;
        final int base = Integer.MAX_VALUE;
        int[] toSort = new int[lenght];
        toSort = ArrayMaker.getArray(lenght, base, toSort);
       // (Arrays.toString(toSort));
        System.out.println("bubble");
       long time = System.currentTimeMillis();
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length; j++) {
                if (toSort[j] > toSort[i + 1]) {
                    toSort = Change.changeArray(toSort,j,i+1);
                }
            }
        }
       // System.out.println(Arrays.toString(toSort));
        System.out.println("Время выполнения " + ((System.currentTimeMillis() - time) / 1000) + " секунд");
        System.out.println("selection");

        toSort = ArrayMaker.getArray(lenght, base, toSort);
       // System.out.println(Arrays.toString(toSort));
        time = System.currentTimeMillis();
        for (int i = 0; i < toSort.length; i++) {
            int pos = i;
            int min = toSort[i];

            for (int j = i + 1; j < toSort.length; j++) {
                if (toSort[j] < min) {
                    pos = j;
                    min = toSort[j];
                }
            }
            toSort[pos] = toSort[i];
            toSort[i] = min;
        }

       // System.out.println(Arrays.toString(toSort));
        System.out.println("Время выполнения " + ((System.currentTimeMillis() - time) ) /1000 + " секунд");
        System.out.println("Collections.sort");
        time = System.currentTimeMillis();
      //  toSort = ArrayMaker.getArray(lenght, base, toSort);

        List list = new ArrayList();
        for (int value : toSort) {
            list.add(value);
        }

     time = System.currentTimeMillis();
         Collections.sort(list);

        System.out.println("Время выполнения " + ((System.currentTimeMillis() - time) / 1000) + " секунд");
        }

    }

