package ru.otus;

public class Change {
    static int[] changeArray(int[] array, int j, int i) {
         int temp = array[j];
        array[j] = array[i];
         array[i] = temp;
        return array;
    }
}


