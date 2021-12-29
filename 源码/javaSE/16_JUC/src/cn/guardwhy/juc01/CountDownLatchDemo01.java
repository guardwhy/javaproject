package cn.guardwhy.juc01;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo01 {
    public static void main(String[] args) throws InterruptedException {
        // 1.创建countDownLatch对象
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i <=6 ; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + " Start");
                // 数量-1
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }
        // 等待计数器归零，然后再往下执行。
        countDownLatch.await();
        System.out.println("End..");
    }
}
