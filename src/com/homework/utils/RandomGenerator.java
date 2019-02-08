package com.homework.utils;

import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {

    public static int[] randomArr(int arrLength, int bound) {
        int[] arr = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt(bound);
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        return arr;
    }
}