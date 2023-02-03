package com.hua.java8;

import java.util.Optional;
import java.util.stream.Stream;

public class TestReduce {


    public static void main(String[] args) {
        Integer reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
        reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce((x, y) -> x + y).get();
        System.out.println(reduce);
    }
}
