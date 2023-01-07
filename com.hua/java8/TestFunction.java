package com.hua.java8;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) -> x + 5;
        System.out.println(function.apply(5));
    }
}
