package no.steliga.alglib;

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
}
