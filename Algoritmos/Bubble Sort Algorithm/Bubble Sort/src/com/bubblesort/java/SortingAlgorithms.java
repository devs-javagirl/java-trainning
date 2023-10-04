package com.bubblesort.java;

import com.bubblesort.java.BubbleSort;

public class SortingAlgorithms {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] list = {3, 5, 1, 2, 4};
        int[] sortedList = bubbleSort.sortList(list);

        for (int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
