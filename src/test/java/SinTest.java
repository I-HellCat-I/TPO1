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

    @Test
    void testBaseAngles_FirstQuadrant() {
        assertSinEquals(0.0);
        assertSinEquals(Math.PI / 6); // 30 градусов
        assertSinEquals(Math.PI / 4); // 45 градусов
        assertSinEquals(Math.PI / 3); // 60 градусов
    }

    @Test
    void testBaseAngles_BoundaryPoints() {
        assertSinEquals(Math.PI / 2); // 90 градусов (Максимум)
        assertSinEquals(Math.PI);     // 180 градусов (Ноль)
        assertSinEquals(3 * Math.PI / 2); // 270 градусов (Минимум)
    }

    @Test
    void testNegativeAngles() {
        assertSinEquals(-Math.PI / 6);
        assertSinEquals(-Math.PI / 2);
        assertSinEquals(-Math.PI);
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
    void testEdgeCases_NaN_and_Infinity() {
        assertTrue(Double.isNaN(LabFunctions.taylor_series_sin_with_precision(Double.NaN, EPS)));

        assertTrue(Double.isNaN(LabFunctions.taylor_series_sin_with_precision(Double.POSITIVE_INFINITY, EPS)));
        assertTrue(Double.isNaN(LabFunctions.taylor_series_sin_with_precision(Double.NEGATIVE_INFINITY, EPS)));
    }

    @Test
    void testPrecision_HighEps() {
        // Если просим низкую точность (eps = 0.1), ряд обрывается рано.
        // Поэтому, сравниваем с первыми членами ряда.
        double x = Math.PI / 4;
        double eps = 0.1;
        // Для x=0.785, первый член = 0.785. Второй = -0.785^3 / 6 = -0.08.
        // Модуль второго < 0.1, значит цикл прервется, и вернется только первый член (x).
        double actual = LabFunctions.taylor_series_sin_with_precision(x, eps);
        assertEquals(x, actual, 1e-9, "Грубая точность провалила проверку");
    }

    @Test
    void testPrecision_LowEps() {
        double x = 1.0;
        double hardEps = 1e-15;
        double expected = Math.sin(x);
        double actual = LabFunctions.taylor_series_sin_with_precision(x, hardEps);
        assertEquals(expected, actual, 1e-14, "Высокая точность провалила проверку");
    }
}
