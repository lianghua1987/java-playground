package main.com.hua.java8;

public class TestMethodRef {

    public static void main(String[] args) {
        new Thread(new TestMethodRef()::method).start();
    }

    public void method() {
        System.out.println("hello hua");
    }

}
