package com.hua.java13and14;

public class TestInstaceofPattern {

    public static void main(String[] args) {
        Object obj = get();

        if (obj instanceof String str) {
            System.out.println((String) obj);
            System.out.println(str);
        }
    }

    static Object get() {
        return "this is a string";
    }
}
