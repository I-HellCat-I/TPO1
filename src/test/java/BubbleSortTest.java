import com.hellcat.BubbleSorter;
import com.hellcat.BubbleSorterWithTrace;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    BubbleSorterWithTrace sorter = new BubbleSorterWithTrace();

    @BeforeEach
    public void flsuh() {
        sorter.flush();
    }

    @Test
    void testTrace_SortedArray() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

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

        boolean result = sorter.bubble_sort_traced(list);

        List<String> actualTrace = sorter.getTrace();

        assertTrue(result, "Сортировка должна завершиться успешно");
        assertIterableEquals(expectedTrace, actualTrace, "Трасса выполнения не совпадает с эталонной!");
        assertIterableEquals(Arrays.asList(1, 2, 3), list, "Массив должен остаться отсортированным");
    }

    @Test
    void testTrace_ReversedArray() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1));

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

        boolean result = sorter.bubble_sort_traced(list);

        List<String> actualTrace = sorter.getTrace();

        assertTrue(result);
        assertIterableEquals(expectedTrace, actualTrace, "Трасса выполнения обменов не совпадает!");
        assertIterableEquals(Arrays.asList(1, 2, 3), list, "Массив не отсортирован должным образом!");
    }

    @Test
    void testTrace_UnsupportedOperation() {
        List<Integer> list = List.of(2, 1); // Неизменяемый список

        List<String> expectedTrace = Arrays.asList(
                "START",
                "OUTER_LOOP_START_0",
                "INNER_LOOP_COMPARE_0",
                "SWAP_0_1",
                "ERROR_CAUGHT" // UnsupportedOperationException
        );

        boolean result = sorter.bubble_sort_traced(list);

        List<String> actualTrace = sorter.getTrace();

        assertFalse(result, "Сортировка должна вернуть false при ошибке модификации");
        assertIterableEquals(expectedTrace, actualTrace, "Трасса ошибки не совпадает!");
    }

    @Test
    void testNullListInput() {

        assertThrows(NullPointerException.class, () -> {
            BubbleSorterWithTrace sorter = new BubbleSorterWithTrace();
            sorter.bubble_sort_traced(null);
        });
        List<String> actualTrace = sorter.getTrace();
        System.out.println(actualTrace);
    }

    @Test
    void testRandomListInput() {
        BubbleSorter sorter = new BubbleSorter();
        Random random = new Random(7919);
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int length = random.nextInt(10, 100);
            for (int j = random.nextInt(10); j < length*100; j += random.nextInt(10)) {
                expected.add(j);
            }
            List<Integer> actual = new ArrayList<>(expected.size());
            actual.addAll(expected);
            Collections.shuffle(actual, random);
            String shuffledString = actual.toString();
            sorter.bubble_sort(actual);
            assertIterableEquals(expected, actual, "Некорректная сортировка у " + shuffledString + "\n" +
                    "Ожидали: " + expected.toString() + "\n" +
                    "Получили: " + actual.toString() );
            expected.clear();
            actual.clear();
        }

    }
}

