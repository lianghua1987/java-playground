package com.hua.java8;

import java.util.function.Predicate;

public class TestPredicate {


    public static void main(String[] args) {

        Predicate<Integer> predicate = (x) -> x == 5;

        method(predicate, 5);
        method(predicate.negate(), 5);
        method(predicate.or((x) -> x == 6), 5);
        method(predicate.and((x) -> x == 6), 5);
    }


    static <T> void method(Predicate<T> predicate, T value) {
        if (predicate.test(value)) {
            System.out.println("correct");
        } else {
            System.out.println("wrong");
        }

    }
}
