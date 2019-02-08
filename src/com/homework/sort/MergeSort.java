package com.homework.sort;

public class MergeSort {

    private int[] sourceArray;
    private int[] tempArr;

    public MergeSort(int[] sourceArray) {
        this.sourceArray = sourceArray;
    }

    public void sort() {
        this.tempArr = new int[sourceArray.length];
        mergeSort(0, sourceArray.length - 1);
    }

    private void mergeSort(int minItem, int maxItem) {
        if (minItem < maxItem) {
            int middleItem = minItem + (maxItem - minItem) / 2;
            mergeSort(minItem, middleItem);
            mergeSort(middleItem + 1, maxItem);
            merge(minItem, middleItem, maxItem);
        }
    }

    private void merge(int minItem, int middleItem, int maxItem) {
        for (int i = minItem; i <= maxItem; i++) {
            tempArr[i] = sourceArray[i];
        }
        int i = minItem;
        int j = middleItem + 1;
        int k = minItem;
        while (i <= middleItem && j <= maxItem) {
            if (tempArr[i] <= tempArr[j]) {
                sourceArray[k] = tempArr[i];
                i++;
            } else {
                sourceArray[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= middleItem) {
            sourceArray[k] = tempArr[i];
            k++;
            i++;
        }
    }

    public int[] getSourceArray() {
        System.out.println("Merge sort: ");
        return sourceArray;
    }
}