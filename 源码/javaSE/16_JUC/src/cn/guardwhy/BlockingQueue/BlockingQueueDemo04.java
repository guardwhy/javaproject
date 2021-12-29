package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo04 {
    public static void main(String[] args) throws InterruptedException {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        blockingQueue.offer("kobe");
        blockingQueue.offer("Durant");
        blockingQueue.offer("James");
        blockingQueue.offer("curry", 3, TimeUnit.SECONDS); // 等待超过3秒就退出 


        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));// 等待超过3s就退出
    }
}
