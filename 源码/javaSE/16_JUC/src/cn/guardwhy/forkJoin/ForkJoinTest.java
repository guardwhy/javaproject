package cn.guardwhy.forkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class ForkJoinTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
         // test1();    // sum=500000000500000000 时间: 6235
         test2();    // sum=500000000500000000 时间: 6017
        // test03();   // sum=500000000500000000 时间: 102
    }

    // 1.普通方式
    public static void test1() {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (Long i = 1L; i <=10_0000_0000 ; i++) {
            sum += i;
        }
        Long end = System.currentTimeMillis();
        System.out.println("sum=" +sum+" 时间: " + (end-start));
    }

    // 2.使用ForkJoin方法
    private static void test2() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinDemo(0L, 10_0000_0000L);
        // 提交任务
        ForkJoinTask<Long> submit = forkJoinPool.submit(task);
        Long sum = submit.get();

        long end = System.currentTimeMillis();
        System.out.println("sum=" +sum+" 时间: " + (end-start));
    }

    // 链式编程
    private static void test03() {
        long start = System.currentTimeMillis();
        // Stream并行流
        long sum = LongStream.rangeClosed(0L, 10_0000_0000L).parallel().reduce(0, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum=" +sum+" 时间: " + (end-start));
    }

}
