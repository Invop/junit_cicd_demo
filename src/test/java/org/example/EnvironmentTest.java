package org.example;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junitpioneer.jupiter.SetEnvironmentVariable;
class EnvironmentTest {
    @Test
    @SetEnvironmentVariable(key = "ENV", value = "DEV")
    void testOnlyOnDevEnvironment() {
        String env = System.getenv("ENV");
        Assumptions.assumeTrue("DEV".equals(env), "NOT DEV");
        // Далі тест виконається, лише якщо ENV=DEV
        assertTrue(true);
    }
}