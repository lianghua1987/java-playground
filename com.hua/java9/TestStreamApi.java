package com.hua.java9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamApi {

    @Test
    public void stream() {
        List<Integer> integers = Arrays.asList(5, 10, 15, 16, 20, 25, null);
        System.out.println(integers.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));
        System.out.println(integers.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));
        System.out.println(integers.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));
    }
}
