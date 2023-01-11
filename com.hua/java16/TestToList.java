package com.hua.java16;

import java.util.List;
import java.util.stream.Collectors;

public class TestToList {
    public static void main(String[] args) {
        List<String> strings = List.of(1, 2, 3, 4).stream().map(String::valueOf).toList();
    }
}
