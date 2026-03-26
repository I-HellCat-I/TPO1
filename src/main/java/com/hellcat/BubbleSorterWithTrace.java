package com.hellcat;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BubbleSorterWithTrace extends BubbleSorter {
    private List<String> trace;
    private boolean doTrace = false;

    public BubbleSorterWithTrace() {
        trace = new ArrayList<>();
    }

    private void addTrace(String trace) {
        this.trace.add(trace);
    }

    public void flush() {
        trace.clear();
    }
    @Override
    public <T extends Comparable<T>> boolean bubble_sort(List<T> list) {
        addTrace("START");
        boolean res = super.bubble_sort(list);
        addTrace("END_SUCCESS");
        return res;
    }

    @Override
    protected <T extends Comparable<T>> boolean externalFor(List<T> list) {
        return super.externalFor(list);
    }

    @Override
    protected <T extends Comparable<T>> boolean internalFor(List<T> list, int i) {
        addTrace("OUTER_LOOP_START_" + i);
        boolean res = super.internalFor(list, i);
        addTrace("OUTER_LOOP_END_" + i);
        return res;
    }

    @Override
    protected <T extends Comparable<T>> boolean compare(List<T> list, int j) {
        addTrace("INNER_LOOP_COMPARE_" + j);
        try {
            return super.compare(list, j);
        } catch (UnsupportedOperationException | ClassCastException | IllegalArgumentException e) {
            addTrace("ERROR_CAUGHT");
            return false;
        } catch (NullPointerException e) {
            addTrace("NPE_THROWN");
            throw e;
        }
    }

    @Override
    protected <T extends Comparable<T>> boolean swap(List<T> list, int j) {
        addTrace("SWAP_" + j + "_" + (j + 1));
        return super.swap(list, j);
    }

    public <T extends Comparable<T>> boolean bubble_sort_traced(List<T> list) {
        boolean saveDoTrace = doTrace;
        doTrace = true;
        boolean result = bubble_sort(list);
        doTrace = saveDoTrace;
        return result;
    }

    private  <T extends Comparable<T>> boolean bubble_sortt(List<T> list) {
        T temp;
        addTrace("START");

        for (int i = 0; i < list.size() - 1; i++) {
            addTrace("OUTER_LOOP_START_" + i);

            for (int j = 0; j < list.size() - 1; j++) {
                addTrace("INNER_LOOP_COMPARE_" + j);

                try {
                    if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                        addTrace("SWAP_" + j + "_" + (j + 1));
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                } catch (UnsupportedOperationException | ClassCastException | IllegalArgumentException e) {
                    addTrace("ERROR_CAUGHT");
                    return false;
                } catch (NullPointerException e) {
                    addTrace("NPE_THROWN");
                    throw e;
                }
            }
            addTrace("OUTER_LOOP_END_" + i);
        }
        addTrace("END_SUCCESS");
        return true;
    }
}
