package com.hua.java8;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class TestBinaryOperator {

    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (x, y) -> x.concat(y);
        System.out.println(binaryOperator.apply("aaa","bbb"));

        System.out.println("--------------------------------------");
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Integer::compareTo);
        System.out.println(maxBy.apply(2, 3));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(Integer::compareTo);
        System.out.println(minBy.apply(4, 5));
    }
}
