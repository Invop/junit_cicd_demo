package org.example;

import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAddition() {
        assertEquals(4, MathUtils.add(2, 2));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testIsPositive(int number) {
        assertTrue(MathUtils.isPositive(number));
    }

    @Test
    void testDivision() {
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
    }
}