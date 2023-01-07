package com.hua.java8;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.empty();
        System.out.println(optional.orElse(4));
        System.out.println(Optional.ofNullable(optional).get());
    }
}
