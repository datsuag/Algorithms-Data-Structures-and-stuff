package no.steliga.alglib;

import java.util.Arrays;
import java.util.Random;

/**
 * Simple static class for various array helper methods
 * so I don't have to keep writing them. Will be continuously
 * updated as I run into new problems to solve.
 */
public class ArrayUtils {
    /**
     * Swaps two values in an array.
     * @param data the array
     * @param i index to be swapped
     * @param j index to be swapped
     * @param <T> type of array
     */
    public static <T> void swap(T[] data, int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    /**
     * Fills a 2d array with the supplied element.
     * @param arr array to be filled
     * @param el element to fill array with
     * @param <T> type of array
     * @return the array itself
     */
    public static <T> T[][] fill2d(T[][] arr, T el) {
        for (T[] row : arr) {
            Arrays.fill(row, el);
        }
        return arr;
    }

    /**
     * Overloaded version of fill2d for int arrays
     * @param arr int array
     * @param el int
     * @return int[][]
     */
    public static int[][] fill2d(int[][] arr, int el) {
        for (int[] row : arr) {
            Arrays.fill(row, el);
        }
        return arr;
    }

    /**
     * Checks whether two arrays are equal, meaning they
     * have the same elements in the same indices and are the same size.
     * @param a first array
     * @param b second array
     * @param <T> type of arrays
     * @return true if equal, else false
     */
    public static <T extends Comparable <T>> boolean equal(T[] a, T[] b) {  //TODO: Maybe delete equal()?
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(b[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns an Integer[] filled with random numbers
     * @param length desired array length
     * @param upper upper limit for random numbers
     * @return Integer[]
     */
    public static Integer[] randomIntegerArray(int length, int upper) {
        int[] array = new Random().ints(length, 0, upper).toArray();
        return intToIntegerArray(array);
    }

    /**
     * Returns a randomly sized Integer[] filled with random numbers.
     * @return
     */
    public static Integer[] randomIntegerArray() {
        int[] rand = new Random().ints(2, 0, 100000).toArray();
        return randomIntegerArray(rand[0], rand[1]);
    }

    /**
     * Converts an int[] to an Integer[]
     * @param arr array to be converted
     * @return converted array
     */
    public static Integer[] intToIntegerArray(int[] arr) {
        Integer[] result = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.valueOf(arr[i]);
        }
        return result;
    }

    /**
     * Checks whether two 2d arrays of objects are equal
     * @param a first array
     * @param b second array
     * @param <T> type of array
     * @return true if equal, else false
     */
    public static <T> boolean equals2d(T[][] a, T[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!Arrays.equals(a[i], b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void test() {
        System.out.println("Test");
    }
}
