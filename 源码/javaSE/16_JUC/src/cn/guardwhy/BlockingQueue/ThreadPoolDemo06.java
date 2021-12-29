package cn.guardwhy.BlockingQueue;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Executors 工具类、3大方法
public class ThreadPoolDemo06 {
    public static void main(String[] args) {
        // ExecutorService threadPool = Executors.newSingleThreadExecutor(); // 单个线程
        // ExecutorService threadPool = Executors.newFixedThreadPool(5); // 创建一个固定的线程池的大小
        ExecutorService threadPool = Executors.newCachedThreadPool();// 无限容器

        try {
            for (int i = 0; i < 100; i++) {
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
