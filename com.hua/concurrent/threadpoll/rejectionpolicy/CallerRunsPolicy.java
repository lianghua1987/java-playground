package com.hua.concurrent.threadpoll.rejectionpolicy;

import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CallerRunsPolicy {


    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                1,
                2,
                0l,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            Future<?> submit = threadPoolExecutor.submit(() -> {
                System.out.println("Thread: " + Thread.currentThread().getName() + " executing task: " + taskId);
                try {
                    if (taskId == 4) {
                        Thread.sleep(5000);
                    }

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            System.out.println(submit.isDone());
        }

        threadPoolExecutor.shutdown();

    }
}
