import com.hellcat.LabFunctions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class SinTest {
    private static final double EPS = 1e-7;
    private static final double DELTA = 1e-6;

    private void assertSinEquals(double x) {
        double expected = Math.sin(x);
        double actual = LabFunctions.taylor_series_sin_with_precision(x, EPS);
        assertEquals(expected, actual, DELTA, "Провал на координате x = " + x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, Math.PI / 6, Math.PI / 4, Math.PI / 3})
    void testBaseAngles_FirstQuadrant(double x) {
        assertSinEquals(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI / 2, Math.PI, 3 * Math.PI / 2})
    void testBaseAngles_BoundaryPoints(double x) {
        assertSinEquals(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI / 6, -Math.PI / 2, -Math.PI})
    void testNegativeAngles(double x) {
        assertSinEquals(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {
            2 * Math.PI + Math.PI / 6,  // Один период вперед
            10 * Math.PI + Math.PI / 2, // 5 периодов вперед
            100 * Math.PI               // 50 периодов вперед (должен быть 0)
    })
    void testNormalization_PositiveOverflow(double x) {
        assertSinEquals(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {
            -2 * Math.PI - Math.PI / 4,  // Один период назад
            -11 * Math.PI,               // Нечетное число полупериодов
            -1000 * Math.PI              // Жесткий минус
    })
    void testNormalization_NegativeOverflow(double x) {
        assertSinEquals(x);
    }

    @Test
    void testEdgeCases_NaN() {
        assertTrue(Double.isNaN(LabFunctions.taylor_series_sin_with_precision(Double.NaN, EPS)));
    }

    @ParameterizedTest
    @ValueSource(doubles = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY})
    void testEdgeCases_Infinity(double x) {
        assertTrue(Double.isNaN(LabFunctions.taylor_series_sin_with_precision(x, EPS)));
    }

    @Test
    void testPrecision_HighEps() {
        double x = Math.PI / 4;
        double eps = 0.01;
        double actual = LabFunctions.taylor_series_sin_with_precision(x, eps);
        assertEquals(Math.sin(x), actual, 0.1, "Грубая точность провалила проверку");
    }

    @Test
    void testPrecision_LowEps() {
        double x = 1.0;
        double hardEps = 1e-15;
        double expected = Math.sin(x);
        double actual = LabFunctions.taylor_series_sin_with_precision(x, hardEps);
        assertEquals(expected, actual, 1e-14, "Высокая точность провалила проверку");
    }

    @Test
    void testEpsLTZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            LabFunctions.taylor_series_sin_with_precision(0.0, 0.0);
        });
    }
}
