package com.hua.java17;

import java.io.*;

public class TestSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new ObjectOutputStream(new FileOutputStream("Person.ser")).writeObject(new Person(20, "Hua"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Person.ser"));
        ObjectInputFilter filter1 = ObjectInputFilter.Config.createFilter("com.hua.java17.*;!*");
        ObjectInputFilter filter2 = ObjectInputFilter.allowFilter(c -> c.equals(Person1.class), ObjectInputFilter.Status.REJECTED);
        objectInputStream.setObjectInputFilter(ObjectInputFilter.merge(filter2, filter1));
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person);
        try {
            new ObjectOutputStream(new FileOutputStream("Person1.ser")).writeObject(new Person1(21, "Hua1"));
            Person1 person1 = (Person1) (new ObjectInputStream(new FileInputStream("Person1.ser")).readObject());
            System.out.println(person1);
        } catch (NotSerializableException e) {
            System.out.println("Record not serializable");
        }
    }

    static record Person1(int age, String name) {
    }


    static class Person implements Serializable {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
