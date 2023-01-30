package com.hua.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

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
        public void test4a(int a, int b) {
            assertTrue(a % 2 == 0 && b != 0);
        }

        @ParameterizedTest
        @CsvSource(value = {"2, 2, 2", "3, 3, 3", "4,4,4"})
        public void test4b(int a, int b, int c) {
            assertTrue(a % 2 == 0 && b != 0 && c > 1);
        }

        @ParameterizedTest
        @MethodSource("test4cSource")
        public void test4c(int a, int b, int c) {
            assertTrue(a >= 0 && b >= 0 && c >= 0);
        }

        private static Stream<Arguments> test4cSource() {
            return Stream.of(
                    Arguments.of(0, 0, 0),
                    Arguments.of(8, 8, 8),
                    Arguments.of(5, 5, 5)
            );
        }

        @ParameterizedTest
        @MethodSource
        public void test4d(int a, int b, int c) {
            assertTrue(a >= 0 && b >= 0 && c >= 0);
        }

        // Name match
        private static Stream<Arguments> test4d() {
            return Stream.of(
                    Arguments.of(0, 0, 0),
                    Arguments.of(8, 8, 8),
                    Arguments.of(5, 5, 5)
            );
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

    @Test
    public void test10() {
        Instant start = Instant.now();
        LongStream.range(0, 50000000l).forEach(
                i -> assertEquals(9, Integer.valueOf("9"), "sync dynamic print message " + i)
        ); // 1088
        System.out.println(Duration.between(start, Instant.now()).toMillis());
    }

    @Test
    public void test11() {
        Instant start = Instant.now();
        LongStream.range(0, 50000000l).forEach(
                i -> assertEquals(9, Integer.valueOf("9"), () -> "async dynamic print message" + i)
        ); // 49
        System.out.println(Duration.between(start, Instant.now()).toMillis());
    }

}
