package com.myst1k;

public class QuickSort {
    public static void quickSort(int[] notSortedList, int left, int right) {
        //divideIndex - корень
        if (left < right) {
            int divideIndex = partition(notSortedList, left, right);
            quickSort(notSortedList, left, divideIndex - 1); //не включая корень
            quickSort(notSortedList, divideIndex, right);
        }
    }
    private static int partition(int[] arrayQuickSort, int left, int right) {
        int rightIndex = right;
        int leftIndex = left;

        int pivot = left +(right - left) / 2;
        while (leftIndex <= rightIndex) {

            while (arrayQuickSort[leftIndex] < arrayQuickSort[pivot]) {
                leftIndex++;
            }
            while (arrayQuickSort[rightIndex] > arrayQuickSort[pivot]) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arrayQuickSort, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(int[] notSorted, int index1, int index2) {
        int temp = notSorted[index1];
        notSorted[index1] = notSorted[index2];
        notSorted[index2] = temp;
    }
}
