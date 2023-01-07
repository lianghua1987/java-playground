package com.hua.java10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTeeing {

    public static void main(String[] args) {
        InnerClass collect = Stream.of(5, 10, 8, 20, 25).collect(Collectors.teeing(Collectors.counting(), Collectors.filtering(x -> x % 5 == 0, Collectors.toList()), InnerClass::new));
        System.out.println(collect);
    }

    static class InnerClass {
        long count;
        List<Integer> list;


        public InnerClass(long count, List<Integer> list) {
            this.count = count;
            this.list = list;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "count=" + count +
                    ", list=" + list +
                    '}';
        }
    }
}
