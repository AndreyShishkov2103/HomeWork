package lesson13;

import lesson12.HomeWork12;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #13
 * @author Andrey Shishkov
 * @version 2024-02-14
 */
public class HomeWork13 {
    public static void main(String[] args) {
        // task #1
        long startTime = System.currentTimeMillis();
        //int[] array = HomeWork12.createRandomArray(100_000, 100);
        int[] array = HomeWork12.createRandomArray(100_000_000, 100);
        System.out.println((System.currentTimeMillis() - startTime) + " ms - create array");

        startTime = System.currentTimeMillis();
        HomeWork12.linearSearch(array, 45);
        System.out.println((System.currentTimeMillis() - startTime) + " ms - linear search");

        startTime = System.currentTimeMillis();
        HomeWork12.selectionSort(array);
        System.out.println((System.currentTimeMillis() - startTime) + " ms - selection sort");

        startTime = System.currentTimeMillis();
        HomeWork12.binarySearch(array, 45);
        System.out.println((System.currentTimeMillis() - startTime) + " ms - binary search");
    }
}
