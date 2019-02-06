package com.homework;

import com.homework.sort.BubbleSort;
import com.homework.utils.RandomGenerator;

public class MainApp {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(RandomGenerator.randomArr(10));
    }
}
