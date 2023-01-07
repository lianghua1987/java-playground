package com.hua.java9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestImmutableCollection {

    @Test
    public void main() {
        List<String> list = List.of("a", "b", "c");

        assertThrows(UnsupportedOperationException.class, () -> {
            list.add("d");
        });
    }
}
