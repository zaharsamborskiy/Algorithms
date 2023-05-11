package com.myst1k;

public class Factorial {
    public static int factorialRecursion(int number) {
        int result = 1;
        if (number == 0) {
            System.out.print(" = " + result + "\n");
            return result;
        }
        if (number == 1) {
            System.out.print(" * 1 = ");
            return result;
        }
        System.out.print(number);

        if (number != 2) {
            System.out.print(" * ");
        }
        result = number * factorialRecursion(number-1);
        return result;
    }
    public static void countDown(int n) {
        if (n <= 0) {
            System.out.print(n + "\n");
            return;
        }
        System.out.print(n + " -> ");
        countDown(n - 1);
    }
}
