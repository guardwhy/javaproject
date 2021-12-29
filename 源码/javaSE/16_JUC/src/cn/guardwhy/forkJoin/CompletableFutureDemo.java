package cn.guardwhy.forkJoin;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/*
* 异步调用:completableFuture
* 1. 异步执行
* 2.成功调回
* 3.失败回调
*/
public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.1没有返回值的runAsync 异步回调
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(()->{
           // 1.2 休息2s
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "runAsync=>Void");
        });
        System.out.println("123");
        // 1.3 获取阻塞执行结果
        completableFuture1.get();

        System.out.println("======================");

        // 2.1 有返回值的supplyAsync 异步回调
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName() + "supplyAsync=>Integer");
            int i = 10/0;
            return 666;
        });
        System.out.println(completableFuture2.whenComplete((t,u)->{
            // 2.2 正常的返回结果
            System.out.println("t==>" + t);
            // 2.3 java.util.concurrent.CompletionException
            System.out.println("u==>" + u);
        }).exceptionally((e)->{
            System.out.println(e.getMessage());
            // 2.4 可以获取到错误的返回结果
            return 111;
        }).get());
    }
}
