package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Tag("fast")
class FastTests {
    @Test
    void additionIsCorrect() {
        assertEquals(4, 2 + 2);  // Simple math test
    }

    @Test
    void stringIsNotEmpty() {
        assertFalse("Hello".isEmpty());  // String validation
    }
}

@Tag("slow")
class SlowTests {
    @Test
    void expensiveOperationTest() {
        assertTimeoutPreemptively(
                java.time.Duration.ofSeconds(6),
                () -> Thread.sleep(1000)
        );
    }

}