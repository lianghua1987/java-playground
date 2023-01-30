package com.hua.java8;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator = x -> x.toUpperCase();
        System.out.println(stringUnaryOperator.apply("hello"));
    }
}
