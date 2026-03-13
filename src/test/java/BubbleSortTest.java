import com.hellcat.LabFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void testTrace_SortedArray() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<String> actualTrace = new ArrayList<>();

        List<String> expectedTrace = Arrays.asList(
                "START",
                "OUTER_LOOP_START_0",
                "INNER_LOOP_COMPARE_0",
                "INNER_LOOP_COMPARE_1",
                "OUTER_LOOP_END_0",
                "OUTER_LOOP_START_1",
                "INNER_LOOP_COMPARE_0",
                "INNER_LOOP_COMPARE_1",
                "OUTER_LOOP_END_1",
                "END_SUCCESS"
        );

        boolean result = LabFunctions.bubble_sort_traced(list, actualTrace);

        assertTrue(result, "Сортировка должна завершиться успешно");
        assertIterableEquals(expectedTrace, actualTrace, "Трасса выполнения не совпадает с эталонной!");
        assertIterableEquals(Arrays.asList(1, 2, 3), list, "Массив должен остаться отсортированным");
    }

    @Test
    void testTrace_ReversedArray() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1));
        List<String> actualTrace = new ArrayList<>();

        List<String> expectedTrace = Arrays.asList(
                "START",
                "OUTER_LOOP_START_0",
                "INNER_LOOP_COMPARE_0",
                "SWAP_0_1",
                "INNER_LOOP_COMPARE_1",
                "SWAP_1_2",
                "OUTER_LOOP_END_0",
                "OUTER_LOOP_START_1",
                "INNER_LOOP_COMPARE_0",
                "SWAP_0_1",
                "INNER_LOOP_COMPARE_1",
                "OUTER_LOOP_END_1",
                "END_SUCCESS"
        );

        boolean result = LabFunctions.bubble_sort_traced(list, actualTrace);

        assertTrue(result);
        assertIterableEquals(expectedTrace, actualTrace, "Трасса выполнения обменов не совпадает!");
        assertIterableEquals(Arrays.asList(1, 2, 3), list, "Массив не отсортирован должным образом!");
    }

    @Test
    void testTrace_UnsupportedOperation() {
        List<Integer> list = List.of(2, 1); // Неизменяемый список
        List<String> actualTrace = new ArrayList<>();

        List<String> expectedTrace = Arrays.asList(
                "START",
                "OUTER_LOOP_START_0",
                "INNER_LOOP_COMPARE_0",
                "SWAP_0_1",
                "ERROR_CAUGHT" // UnsupportedOperationException
        );

        boolean result = LabFunctions.bubble_sort_traced(list, actualTrace);

        assertFalse(result, "Сортировка должна вернуть false при ошибке модификации");
        assertIterableEquals(expectedTrace, actualTrace, "Трасса ошибки не совпадает!");
    }
}

