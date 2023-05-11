package com.myst1k;

public class BinarySearch {
    public static String binarySearch(int[] sortedArray, int target, int start, int end) {
        int index = -1;
        int count = 0;

        while (start <= end) {
            int mid = start +(end - start) / 2;
            if (sortedArray[mid] < target) {
                start = mid + 1;
                count++;
            } else if (sortedArray[mid] > target) {
                end = mid - 1;
                count++;
            } else if (sortedArray[mid] == target) {
                index = mid;
                count++;
                break;
            }
        }
        String positiveAnswer = "Число " + target + " найдено за " + count + " операци(и,й,ю)";
        String negativeAnswer = "Число " + target + " не найдено";
        if (index < 0) return negativeAnswer;
        return positiveAnswer;
    }
    public static int binaryRecursiveSearch(int[] sortedArray, int target, int start, int end) {
        if (start == end) {
            return (sortedArray[start] == target) ? start : -1;
        }
        int mid = start + (end - start) / 2;
        if (target > sortedArray[mid]) {
            return binaryRecursiveSearch(sortedArray, target, mid + 1, end);
        } else if (target < sortedArray[mid]) {
            return binaryRecursiveSearch(sortedArray, target, start, mid - 1);
        }
        System.out.print("Найдено число: ");
        return mid;
    }
}
