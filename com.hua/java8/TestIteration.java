package com.hua.java8;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Stream;

public class TestIteration {
    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::println);

    }
}
