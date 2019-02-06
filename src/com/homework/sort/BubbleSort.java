package com.homework.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] arrInts) {
        int n = arrInts.length;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arrInts[j] > arrInts[j+1]) {
                    int temp = arrInts[j];
                    arrInts[j] = arrInts[j+1];
                    arrInts[j+1] = temp;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long diffTime = endTime - startTime;
        System.out.println("\nОтсортированный массив: \n" + Arrays.toString(arrInts) + "\nВремя сортировка: " + diffTime + "мс");
        return arrInts;
    }
}