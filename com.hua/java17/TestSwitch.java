package com.hua.java17;

public class TestSwitch {

    public static void main(String[] args) {
        Shape shape = new Circle(5);
        int val = switch (shape) {
            case Circle c -> c.radius();
            case Rectangle r -> r.height;
            case null -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
        System.out.println(val);
    }

    static interface Shape {
    }

    static record Circle(int radius) implements Shape {
    }

    static record Rectangle(int length, int height) implements Shape {
    }

}
