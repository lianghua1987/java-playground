package main.com.hua.java8;

import com.hua.java8.Person;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class TestMethodRef {

    public static void main(String[] args) {
        new Thread(new TestMethodRef()::method).start();

        Supplier<Person> supplier = Person::new;
        BiFunction<String, Integer, Person> biFunction = Person::new;

        System.out.println(supplier.get());
        System.out.println(biFunction.apply("hua", 88));

    }

    public void method() {
        System.out.println("hello hua");
    }

}
