package com.hua.java13n14;

public class TestSwitch {
    public static void main(String[] args) {
        int key = 2;
        String result = switch (key) {
            case 1:
            case 5:
                yield "Hua";
            case 2:
                yield "L";
            default:
                throw new IllegalArgumentException();
        };
        System.out.println(result);


        String resp = switch (key) {
            case 1 -> "Hello";
            case 2 -> "World";
            default -> throw new IllegalArgumentException();
        };

        System.out.println(resp);
    }
}
