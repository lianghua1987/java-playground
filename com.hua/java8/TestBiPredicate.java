package com.hua.java8;

import java.util.function.BiPredicate;

public class TestBiPredicate {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate1 = (x, y) -> x > y;
        BiPredicate<Integer, Integer> biPredicate2 = (x, y) -> x < y;
        System.out.println(biPredicate1.or(biPredicate2).test(5, 6));
    }
}
