package com.hua.java8;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {
        Supplier<String> supplier = ()  -> "\uD83C\uDF69";
        System.out.println(supplier.get());
    }
}
