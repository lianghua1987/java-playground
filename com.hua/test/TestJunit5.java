package com.hua.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TestJunit5 {

    @Nested
    class group1 {
        @ParameterizedTest
        @ValueSource(ints = {2, 4, 5, 6})
        public void test2(int a) {
            assertTrue(a % 2 == 0);
        }

        @ParameterizedTest
        @CsvSource(value = {"2, 2", "3, 4", "5,6"})
        public void test4(int a, int b) {
            assertTrue(a % 2 == 0 && b != 0);
        }

    }


    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void test1() {
        assertTrue(true);
    }


    @Test
    public void test3() {
        assertAll(
                () -> assertTrue(true),
                () -> assertTrue(false)
        );
    }


    @Test
    public void test5() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(200);
        });
    }

    String env = "dev";

    @Test
    public void test6() {
        assumeTrue(this.env.equals("prod"));
        assertTrue(false);
    }

    @Test
    @DisplayName("this is a display name")
    public void test7() {
        assertTrue(true);
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void test8() {
        assertTrue(true);
    }

    @Test
    @DisabledOnOs(OS.MAC)
    public void test9() {
        assertTrue(true);
    }
}
