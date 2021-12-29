package cn.guardwhy.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueDemo05 {
    public static void main(String[] args) {
        // 1.创建队列
        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
        // 2.添加元素
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName() + "1");
                blockingQueue.put(" curry");
                System.out.println(Thread.currentThread().getName() + "2");
                blockingQueue.put(" kobe");
                System.out.println(Thread.currentThread().getName() + "3");
                blockingQueue.put(" james");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "NBA").start();

        new Thread(()->{
            // 延迟3s
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName() + blockingQueue.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName() + blockingQueue.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName() + blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"NBA").start();
    }
}
