import com.hellcat.LabFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void testEmpty(){
        ArrayList<Integer> arrayList = new ArrayList<>(0);
        LabFunctions.bubble_sort(arrayList);
        assertTrue(arrayList.isEmpty());
    }

    @Test
    void testSimple(){
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 4, 3, 2 ,1)),
                           expected = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        LabFunctions.bubble_sort(list);
        assertEquals(list, expected);
    }
    @Test
    void testDifferentStructs(){
        List<Integer> list = List.of(5, 4, 3, 2 ,1);
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        LabFunctions.bubble_sort(arrayList);
        assertNotEquals(linkedList, arrayList);
        LabFunctions.bubble_sort(linkedList);
        assertEquals(arrayList, linkedList);
    }

    @Test
    void testIncompleteStructs(){
        List<Integer> list = List.of(5, 4, 3, 2 ,1);
        assertFalse(LabFunctions.bubble_sort(list));
    }
}
