package com.hua.java13n14;

public class TestRecord {

    record Person(String name, int age) {

        String getShit() {
            return "shit";
        }
    }

    public static void main(String[] args) {
        Person p = new Person("hua", 30);
        System.out.println(p);
        System.out.println(p.getShit());
        System.out.println(p.age());

        Person p1 = new Person("hua", 30);
        System.out.println(p1.equals(p));

    }


}
