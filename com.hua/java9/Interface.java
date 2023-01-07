package com.hua.java9;

public interface Interface {
    default void m1() {
        common();
        System.out.println("m1");
    }

    default void m2() {
        common();
        System.out.println("m2");
    }

    private void common() {
        System.out.println("common");
    }


    static void m1S() {
        commonS();
        System.out.println("m1");
    }

    default void m2S() {
        commonS();
        System.out.println("m2");
    }

    static void commonS() {
        System.out.println("common1");
    }
}

