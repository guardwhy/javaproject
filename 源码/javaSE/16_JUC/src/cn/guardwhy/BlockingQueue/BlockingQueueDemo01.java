package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/*
抛出异常
*/
public class BlockingQueueDemo01 {
    public static void main(String[] args) {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        System.out.println(blockingQueue.add("kobe"));
        System.out.println(blockingQueue.add("curry"));
        System.out.println(blockingQueue.add("James"));
        // java.lang.IllegalStateException: Queue full
        // System.out.println(blockingQueue.add("Durant"));

        System.out.println("=========");
        System.out.println("队首元素:" + blockingQueue.element()); // 查看队首元素？

        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        // java.util.NoSuchElementException,抛出异常
        // System.out.println(blockingQueue.remove());
    }
}
