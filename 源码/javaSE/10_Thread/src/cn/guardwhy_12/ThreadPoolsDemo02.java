package cn.guardwhy_12;

import java.util.concurrent.*;

/**
线程池的创建方式二。
线程池在Java中的代表: ExecutorService

创建线程池的API:
     java.util.concurrent.Executors类下：
     -- public static ExecutorService newFixedThreadPool(int nThreads)：
        返回线程池对象。(创建的是有界线程池,也就是池中的线程个数可以指定最大数量)
往线程池中创建线程的API:
     1.public Future<?> submit(Runnable task)
     2.<T> Future<T> submit(Callable<T> task)
总结: Callable接口创建线程对象是可以返回线程执行的结果的。
 */
class Mycallable implements Callable<String>{
    // 定义变量
    private int n;

    // 带参构造器
    public Mycallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        // 定义计数器
        int count = 0;
        for(int i=1; i<=n; i++){
            count += i;
        }
        return Thread.currentThread().getName()+ "=> 1-" + n + "和是: " + count;
    }
}

public class ThreadPoolsDemo02 {
    public static void main(String[] args) {
        // 1.创建一个线程池:线程池固定放置三个线程
        ExecutorService pools = Executors.newFixedThreadPool(3);
        // 2.提交任务给线程池
        Mycallable t1 = new Mycallable(10);
        Mycallable t2 = new Mycallable(20);
        Mycallable t3 = new Mycallable(30);
        Mycallable t4 = new Mycallable(40);

        Future<String> rs1 = pools.submit(t1);
        Future<String> rs2 = pools.submit(t2);
        Future<String> rs3 = pools.submit(t3);
        Future<String> rs4 = pools.submit(t4);

        try {
            System.out.println(rs1.get());
            System.out.println(rs2.get());
            System.out.println(rs3.get());
            System.out.println(rs4.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        pools.shutdown();   // 关闭线程池
    }
}
