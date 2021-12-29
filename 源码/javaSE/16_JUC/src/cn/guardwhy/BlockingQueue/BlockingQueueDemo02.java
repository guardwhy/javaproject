package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo02 {
    public static void main(String[] args) {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        System.out.println(blockingQueue.offer("kobe"));
        System.out.println(blockingQueue.offer("curry"));
        System.out.println(blockingQueue.offer("James"));
        System.out.println(blockingQueue.offer("Durant"));

        System.out.println("=========");
        System.out.println("队首元素:" + blockingQueue.peek()); // 查看队首元素？

        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());   // null 不抛出异常
    }
}
