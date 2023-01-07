package com.hua.java9;

public class TestTryWithResourceBlock {

    public static void main(String[] args) {

        AutoCloseable autoCloseable = () -> System.out.println("autoCloseable");
        try (autoCloseable) {
            System.out.println("no exception");
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}
