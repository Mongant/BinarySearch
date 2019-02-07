package com.homework.search;

public class BinarySearch {

    public static void search(int[] array, int item) {
        int first = 0;
        int last = array.length;
        int position;
        int comparisonCount = 1;

        position = last / 2;
        long startTime = System.currentTimeMillis();
        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        long endTime = System.currentTimeMillis();
        long diffTime = endTime - startTime;
        if (first <= last) {
            System.out.println("\nЗначение " + item + " находится на позици: " + position);
            System.out.println("Количество ставнений: " + comparisonCount + "\nВремя поиска: " + diffTime + "мс");
        } else {
            System.out.println("\nЭлемент не найден в массиве. Произведено "
                    + comparisonCount + " сравнений" + "\nВремя поиска: " + diffTime + "мс");
        }
    }
}
