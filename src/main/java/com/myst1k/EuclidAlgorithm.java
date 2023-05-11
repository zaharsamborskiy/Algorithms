package com.myst1k;

import java.util.Arrays;

public class EuclidAlgorithm {
    public static void euclidAlgorithm(int a, int b) {
        if (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            euclidAlgorithm(a, b);
        } else {
            System.out.println("Алгоритм Евклида " + a + " = " + b);
        }
    }
    public static int findingSumEuclid(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        return array[0] + findingSumEuclid(Arrays.copyOfRange(array, 1, array.length));
    }
}
