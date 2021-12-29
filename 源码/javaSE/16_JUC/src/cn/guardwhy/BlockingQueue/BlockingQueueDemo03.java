package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo03 {
    public static void main(String[] args) throws InterruptedException {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        blockingQueue.put("kobe");
        blockingQueue.put("Durant");
        blockingQueue.put("James");
        // blockingQueue.put("curry"); 一直阻塞


        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        // System.out.println(blockingQueue.take());// 阻塞不停止等待
    }
}
