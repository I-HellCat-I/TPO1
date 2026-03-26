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
            throw new IllegalArgumentException("eps <= 0");
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


}
