package com.hua.java8;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class TestBiFunction {

    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction1 = (x, y) -> x + ":" + y;
        System.out.println(biFunction1.apply("aaa", "bbb"));

        BiFunction<Integer, Predicate<Integer>, String> biFunction2 = (x, y) -> y.test(x) ? "positive" : "negative";
        System.out.println(biFunction2.apply(-5, x -> x >= 0));

    }
}
