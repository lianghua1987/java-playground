package com.hua.java8;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TestParallelStream {

    public static void main(String[] args) {
        System.out.println(execution(TestParallelStream::sequential, 100000000l));
        System.out.println(execution(TestParallelStream::parallel, 100000000l));
    }

    public static long execution(Consumer<Long> consumer, long max) {
        Instant start = Instant.now();
        IntStream.rangeClosed(0, 100).forEach(x -> consumer.accept(max));
        return Duration.between(start, Instant.now()).toMillis();
    }

    public static void sequential(long max) {
        LongStream.rangeClosed(0, max).sequential().sum();
    }

    public static long parallel(long max) {
        return LongStream.rangeClosed(0, max).parallel().sum();
    }
}
