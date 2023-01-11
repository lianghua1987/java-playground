package com.hua.java13n14;

public class TestNpeHelper {

//  -XX:+ShowCodeDetailsInExceptionMessages as JVM arguments
//   However, this looks like enabled already by default
//   ref: https://bugs.openjdk.org/browse/JDK-8247371

    public static void main(String[] args) {
        String str = null;
        System.out.println(str.charAt(0));
    }
}
