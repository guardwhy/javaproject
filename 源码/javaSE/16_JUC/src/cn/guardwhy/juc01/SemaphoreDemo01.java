package cn.guardwhy.juc01;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo01 {
    public static void main(String[] args) {
        // 线程数量
        Semaphore semaphore = new Semaphore(3);
        // 多线程
        for (int i = 0; i <=5 ; i++) {
            new Thread(()->{
                try {
                    // acquire() 得到
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName() + "离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放资源
                    semaphore.release();
                }
            }).start();
        }
    }
}
