package com.feeroz;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.TestWatcher;

import static org.junit.jupiter.api.Assertions.*;

public class GradleTutorialTest {

    @Test
    void verifyNoExceptionThrown() {
        GradleTutorial.main(new String[]{});
    }

    @DisplayName("Multi Assertion in the same execution")
    @Test
    void testAdd() {
        assertAll(
                  () -> assertEquals(42, Integer.sum(19, 23)),
                  () -> assertEquals(50, Integer.sum(20, 30)),
                  () -> assertEquals(20, Integer.sum(10, 10))
                );
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(42, 0);
        });
    }

}