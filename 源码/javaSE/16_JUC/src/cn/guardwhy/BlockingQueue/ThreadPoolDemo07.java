package cn.guardwhy.BlockingQueue;

import java.util.concurrent.*;
/*
 最大线程定义:
 1.CPU 密集型，几核就是几，可以保持CPU的效率最高。cpu密集型的任务来说，线程数等于cpu数是最好的了。
 2.IO 密集型 》= 判断程序中十分消耗的IO线程，线程数大于等于IO任务数是最佳的
*/
public class ThreadPoolDemo07 {
    public static void main(String[] args) {
        // 获取CPU的核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService threadPool = new ThreadPoolExecutor(2,
                Runtime.getRuntime().availableProcessors()
                , 3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        try {
            // 最大容量: Deque + maximumPoolSize
            for (int i = 0; i < 9; i++) {
                // 使用线程池来创建线程
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + " 创建成功..");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭线程池,程序结束。
            threadPool.shutdown();
        }
    }
}
