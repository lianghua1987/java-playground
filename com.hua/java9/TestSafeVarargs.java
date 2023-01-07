package com.hua.java9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSafeVarargs<T> {

    List<T> list = new ArrayList<>();

    //    @SafeVarargs
    public final void unsafe(T... elements) {
        for (T t : elements) {
            list.add(t);
        }
    }

    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
    @Test
    public void plant() {
        TestSafeVarargs testSafeVarargs = new TestSafeVarargs();
        testSafeVarargs.unsafe("test", 1);

        List<String> list = new ArrayList<String>();
        list.add("OOPS");
        list.add("COLLECTION");
        testSafeVarargs.display(list);
    }

}
