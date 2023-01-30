package com.hua.java8;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) -> x + 5;
        System.out.println(function.apply(5));
        Function<String, String> function1 = (str) -> str.toUpperCase();
        Function<String, String> function2 = (str) -> str.concat(" another statement ");
        Function<String, String> function3 = (str) -> str.concat(" testtesttest ");
        System.out.println(function1.andThen(function2).andThen(function3).apply("hello hua"));
        System.out.println(function1.compose(function2).compose(function3).apply("hello hua"));
        System.out.println(function1.compose(function2.compose(function3)).apply("hello hua"));
    }
}
