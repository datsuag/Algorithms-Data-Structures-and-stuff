package no.steliga.alglib.test;
import no.steliga.alglib.ArrayUtils;
import no.steliga.alglib.Sorting;
import org.junit.jupiter.api.*;

import java.time.Instant;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    Integer[][] unsorted = new Integer[10][];
    Integer[][] sorted   = new Integer[10][];
    Instant before;

    @BeforeEach
    void setUp() {
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = ArrayUtils.randomIntegerArray(100, 100);
            sorted  [i] = Arrays.copyOf(unsorted[i], unsorted[i].length);
            Arrays.sort(sorted[i]);
        }
        before = Instant.now();
    }

    @AfterEach
    void benchMark() {

    }

    @Test
    void bubbleSort() {
        for (int i = 0; i < unsorted.length; i++) {
            Sorting.bubbleSort(unsorted[i]);
            assertTrue(Arrays.equals(unsorted[i], sorted[i]));
        }
    }
}