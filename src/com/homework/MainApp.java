package com.homework;

import com.homework.sort.*;
import com.homework.utils.RandomGenerator;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(RandomGenerator.randomArr(10));
        mergeSort.sort();
        System.out.println(Arrays.toString(mergeSort.getSourceArray()));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(RandomGenerator.randomArr(20));
    }
}
