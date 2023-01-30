package com.hua.java8;

import java.util.Arrays;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toLowerCase());
        consumer.accept("test");

        System.out.println("--------------------------------------");
        Arrays.asList("test1", "test2", "test3").forEach(consumer1().andThen(consumer3().andThen(consumer2())));

        System.out.println("--------------------------------------");
        Arrays.asList("test1", "test2", "test3").forEach(consumer1().andThen(consumer3()).andThen(consumer2()));
    }

    private static Consumer<String> consumer1() {
        return i -> System.out.println("1: " + i);
    }

    private static Consumer<String> consumer2() {
        return i -> System.out.println("2: " + i);
    }

    private static Consumer<String> consumer3() {
        return i -> System.out.println("3: " + i);
    }


}
