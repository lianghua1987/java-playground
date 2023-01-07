package com.hua.java10;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCollection {

    @Test
    public void collection() {
        var list = List.of(1, 2, 3, 4, 5);
        List<Integer> collect1 = list.stream().filter(x -> x > 3).collect(Collectors.toList());
        List<Integer> collect2 = list.stream().filter(x -> x > 3).collect(Collectors.toUnmodifiableList());
        collect1.add(1);
        assertThrows(UnsupportedOperationException.class, () -> collect2.add(1));

    }
}
