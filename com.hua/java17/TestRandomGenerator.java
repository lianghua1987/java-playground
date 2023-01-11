package com.hua.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class TestRandomGenerator {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
        System.out.println(randomGenerator.getClass());

        IntStream.range(0, 10).forEach(i -> {
            System.out.println(randomGenerator.nextInt(200));
        });

        RandomGeneratorFactory.all().forEach(r -> System.out.println(r.group() + " " + r.name()));
    }
}
