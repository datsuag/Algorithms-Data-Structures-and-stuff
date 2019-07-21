package no.steliga.alglib.test;

import no.steliga.alglib.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void swap() {
        Integer[] arr = {1, 2};
        ArrayUtils.swap(arr, 0, 1);
        assertEquals(Integer.valueOf(2), arr[0]);
        assertEquals(Integer.valueOf(1), arr[1]);
    }

    @Test
    void equal() {
    }

    @Test
    void swap1() {
    }

    @Test
    void fill2d() {
    }

    @Test
    void fill2d1() {
    }

    @Test
    void equal1() {
    }

    @Test
    void randomIntegerArray() {
    }

    @Test
    void randomIntegerArray1() {
    }

    @Test
    void intToIntegerArray() {
    }

    @Test
    void equals2d() {
    }
}