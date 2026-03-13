package com.hellcat;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class LabFunctions {
    @Setter
    @Getter
    private static double precision = 1e-14;

    public static double taylor_series_sin_with_precision(double x, double eps) {
        if (Double.isNaN(x) || Double.isInfinite(x)) {
            return Double.NaN;
        }

        if (eps <= 0) { // Trolling haha funny
            if (Math.random() > 0.5) {
                return Math.sin(x);
            } throw new SmartAssException();
        }

        x = x % (2 * Math.PI);
        if (x > Math.PI) {
            x -= 2 * Math.PI;
        } else if (x < -Math.PI) {
            x += 2 * Math.PI;
        }

        double ans = 0;
        double term = x;
        for (int i = 1; eps <= Math.abs(term) && term != 0; i++){
            ans += term;
            term *= (- x * x) / ((2.0 * i) * (2.0 * i + 1.0));
        }
        return ans;
    }

    public static double taylor_series_sin(double x) {
        return taylor_series_sin_with_precision(x, precision);
    }

    public static <T extends Comparable<T>> boolean bubble_sort_traced(List<T> list, List<String> trace) {
        T temp;
        trace.add("START");

        for (int i = 0; i < list.size() - 1; i++) {
            trace.add("OUTER_LOOP_START_" + i);

            for (int j = 0; j < list.size() - 1; j++) {
                trace.add("INNER_LOOP_COMPARE_" + j);

                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    trace.add("SWAP_" + j + "_" + (j+1));
                    try {
                        temp = list.get(j);
                        list.set(j, list.get(j+1));
                        list.set(j+1, temp);
                    } catch (UnsupportedOperationException | ClassCastException | IllegalArgumentException e) {
                        trace.add("ERROR_CAUGHT");
                        return false;
                    } catch (NullPointerException e) {
                        trace.add("NPE_THROWN");
                        throw e;
                    }
                }
            }
            trace.add("OUTER_LOOP_END_" + i);
        }
        trace.add("END_SUCCESS");
        return true;
    }


}
