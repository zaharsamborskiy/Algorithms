package com.myst1k;

public class OperationsInArray {
    public static void sumOfArray(int[] array) {
        int res = 0;
        for (Integer i : array) {
            res = res + i;
        }
        System.out.println(res + " сумма элементов в массиве");
    }
    public static int sizeElementsInArray(int[] array) {
        int result = 0;
        if (array.length == 0) {
            return 0;
        }
        array = new int[array.length - 1];
        result++;
        return result + sizeElementsInArray(array);
    }
    public static int findMaxInArray(int[] array) {
        int max = 0;
        for (int findMaxInt : array) {
            if (findMaxInt > max) {
                max = findMaxInt;
            }
        }
        return max;
    }

}
