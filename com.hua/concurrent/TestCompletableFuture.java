package com.hua.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(5000);
                        return "Thread " + Thread.currentThread().getName() + " is running";
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        completableFuture.thenApply(result -> {
//            System.out.println(result);
            return result;
        });
        System.out.println("Main thread is not blocked");
        System.out.println(completableFuture.get());

    }
}
