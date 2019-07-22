package no.steliga.alglib;

import java.util.Arrays;

/**
 * A simple static class for sorting arrays, and perhaps primarily just for
 * exploring sorting algorithms.
 */
public class Sorting {
    /**
     * My implementation of Bubble Sort. A slow sorting algorithm which runs in exponential time.
     * @param data Attay to be sorted
     * @param <T> Type of array. Must implement Comparable.
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] data) {
        if (data.length < 2) {
            return;
        }
        boolean sorted = false;
        int count = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < data.length - count; i++) {
                if (data[i].compareTo(data[i-1]) < 0) {
                    sorted = false;
                    ArrayUtils.swap(data, i, i - 1);
                }
            }
            count++;
        }
    }

    /**
     * Implementation of Insertion Sort. Makes use of Binary Search for quicker insertions.
     * @param data Array to be sorted
     * @param <T> Type of array
     */
    public static <T extends Comparable<T>> void insertionSort(T[] data) {
        for (int i = 1; i < data.length; i++) {
            for (T t  : data)
                System.out.print(t);
            System.out.println();
            int index = Math.abs(Arrays.binarySearch(data, 0, i, data[i]));
            System.out.println("Index = " + index + ", Current = " + data[i]);
            T temp = data[i];
            ArrayUtils.shuffleForward(data, index, i-1);
            data[index] = temp;
        }
    }
}
