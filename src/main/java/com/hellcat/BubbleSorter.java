package com.hellcat;

import java.util.List;

public class BubbleSorter {

    public <T extends Comparable<T>> boolean bubble_sort(List<T> list) {
        return externalFor(list);
    }

    protected <T extends Comparable<T>> boolean externalFor(List<T> list) {
        boolean result = true;
        for (int i = 0; i < list.size() - 1; i++) {
            result &= internalFor(list, i);
        } return result;
    }
    protected <T extends Comparable<T>> boolean internalFor(List<T> list, int i) {
        for (int j = 0; j < list.size() - 1; j++) {
            if (compare(list, j)){
                if (!swap(list, j)) return false;
            }
        } return true;
    }

    protected <T extends Comparable<T>> boolean compare(List<T> list, int j) {
        return list.get(j).compareTo(list.get(j + 1)) > 0;
    }

    protected <T extends Comparable<T>> boolean swap(List<T> list, int j) {
        T temp = list.get(j);
        list.set(j, list.get(j + 1));
        list.set(j + 1, temp);
        return true;
    }
}
