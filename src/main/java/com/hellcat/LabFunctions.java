package com.hellcat;

import java.util.List;

public class LabFunctions {
    private static double factorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {ans *= i;}
        return ans;
    }

    private static double taylor_series_sin_remainder(double x, double n) {
        return Math.pow(Math.abs(x), (n+1)) / factorial((int) n);
    }

    private static double taylor_series_sin_with_precision(double x, double eps) {
        x = x % 2*Math.PI;
        double ans = 0;
        int mul = 1;
        for (int i = 0; eps > taylor_series_sin_remainder(x, i); i++){
            mul = switch (i % 2) {
                case 0 -> 1;
                case 1 -> -1;
                default -> mul;
            };
            ans += mul * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return ans;
    }

    public static double taylor_series_sin(double x) {
        return taylor_series_sin_with_precision(x, Math.pow(10, -9));
    }

    public static <T extends Comparable<T>> boolean bubble_sort(List<T> list){
        // For the love of god, pls less than 10^5 elements
        T temp;
        for (int i = 0; i < list.size()-1; i++){
            for (int j = 0; j < list.size()-1; j++){
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    try {
                        temp = list.get(j);
                        list.set(j, list.get(j+1));
                        list.set(j+1, temp);
                    } catch (UnsupportedOperationException | ClassCastException | IllegalArgumentException e) {
                        return false;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
            }
        }
        return true;
    }


}
