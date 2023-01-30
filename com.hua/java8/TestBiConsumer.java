package com.hua.java8;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class TestBiConsumer {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer1 = (x, y) -> System.out.println(x + ":" + y);
        BiConsumer<String, String> biConsumer2 = (x, y) -> System.out.println(x + "-" + y);
        new HashMap<String, String>() {{
            put("aaa", "111");
            put("bbb", "222");
            put("ccc", "333");
        }}.forEach(biConsumer1.andThen(biConsumer2));

        biConsumer1.accept("ddd", "444");
    }
}
