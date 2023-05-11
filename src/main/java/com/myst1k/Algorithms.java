package com.myst1k;


import java.util.*;

public class Algorithms {

    public static void main(String[] args) {
        ////Binary search////
        System.out.println("<<<<Binary search>>>>");
        int[] sortedArray = new int[100];
        for (int i = 0; i < 100; i++) {
            sortedArray[i] = i;
        }
        int target = 80;
        System.out.println(BinarySearch.binarySearch(sortedArray, target, 0, sortedArray.length - 1));
        System.out.println(BinarySearch.binaryRecursiveSearch(sortedArray, target, 0, sortedArray.length - 1) + " в рекурсии");
        System.out.println("<<<<Binary search>>>>\n");

        ////Quick sort////
        System.out.println("<<<<Quick sort>>>>");
        int[] notSorted = {100,15,30,98,25,200,5};
        System.out.println("До сортировки " + Arrays.toString(notSorted));
        QuickSort.quickSort(notSorted, 0, notSorted.length - 1);
        System.out.println("После сортировки " + Arrays.toString(notSorted));
        System.out.println("<<<<Quick sort>>>>\n");

        ////Log////
        System.out.println("<<<<Logarithm>>>>");
        System.out.println(Log.log2(5) + " log2__");
        System.out.printf("%.2f \n", Math.log10(1024));
        System.out.println("<<<<Logarithm>>>>\n");

        ////Factorial////
        System.out.println("<<<<Factorial>>>>");
        System.out.println(Factorial.factorialRecursion(6));
        Factorial.countDown(10);
        System.out.println("<<<<Factorial>>>>\n");

        ////OperationsInArray////
        System.out.println("<<<<Operations In Array>>>>");
        int[] sumOfList = {10, 10, 10};
        OperationsInArray.sumOfArray(sumOfList);
        int[] sizeElements = {10, 10, 10};
        System.out.println(OperationsInArray.sizeElementsInArray(sizeElements) + " количество элементов в массиве(рекурсия)");
        int[] findMax = {10, 20, 10};
        System.out.println(OperationsInArray.findMaxInArray(findMax) + " поиск максимального числа в массиве");
        System.out.println("<<<<Operations In Array>>>>\n");

        ////Euclid Algorithm////
        System.out.println("<<<<Euclid Algorithm>>>>");
        EuclidAlgorithm.euclidAlgorithm(1680, 640);
        int[] findSumEuclid = {10, 30};
        System.out.println(EuclidAlgorithm.findingSumEuclid(findSumEuclid) + " -> сумма элементов массива(рекурсия)");
        System.out.println("<<<<Euclid Algorithm>>>>\n");

        ////Search in width////
        System.out.println("<<<<Search in width>>>>");
        Map<String, String[]> map = new HashMap<>();
        map.put("Ezzy", new String[]{"Andrew", "Sergio"});
        map.put("Jack", new String[]{"Sveta", "Roma"});
        map.put("Andrew", new String[]{"Jack"});
        map.put("Sveta", new String[]{"Jack"});
        System.out.println(SearchInWidth.searchFriend(map));
        System.out.println("<<<<Search in width>>>>\n");

        ////Dijkstra////
        //    b --- d
        //   /       \
        // a           f
        //   \       /
        //    c --- e
        System.out.println("<<<<Dijkstra>>>>");



        System.out.println("\n<<<<Dijkstra>>>>\n");


    }
}