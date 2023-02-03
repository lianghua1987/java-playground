package com.hua.java9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamApi {

    @Test
    public void stream() {
        List<Integer> integers = Arrays.asList(5, 10, 15, 16, 20, 25, null);
        System.out.println(integers.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));
        System.out.println(integers.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));
        System.out.println(integers.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));
        System.out.println(integers.stream().map(x -> Optional.ofNullable(x)).collect(Collectors.toList()));

        List<List<String>> list = Arrays.asList(Arrays.asList("aaa", "bbb", "ccc"), Arrays.asList("zzz", "000"), Arrays.asList("fff"));
        System.out.println(list.stream().flatMap(x ->x.stream()).collect(Collectors.toList()));
    }
}
