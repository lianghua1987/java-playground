package com.hua.java10;

public class TestString {

    public static void main(String[] args) {
        var str = "hello Hua";
        System.out.println(str.indent(5));

        var val = "10".transform(Integer::parseInt);
        System.out.println(val);
    }
}
