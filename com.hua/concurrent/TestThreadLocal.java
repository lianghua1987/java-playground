package com.hua.concurrent;

import java.util.Random;

public class TestThreadLocal implements Runnable {

    private static final ThreadLocal<Integer> local = ThreadLocal.withInitial(() -> 10);

    public static void main(String[] args) throws InterruptedException {
        TestThreadLocal threadLocalTest = new TestThreadLocal();
        System.out.println( Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(threadLocalTest, "id: " + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+", threadLocal value: "+ local.get());
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println( Thread.currentThread().getName());
            local.set(new Random().nextInt(5000));
            System.out.println("Thread Name= "+Thread.currentThread().getName()+", threadLocal value: "+ local.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
