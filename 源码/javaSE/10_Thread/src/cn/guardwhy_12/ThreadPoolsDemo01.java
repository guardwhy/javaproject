package cn.guardwhy_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
线程池在Java中的代表: ExecutorService

创建线程池的API:
     java.util.concurrent.Executors类下：
     -- public static ExecutorService newFixedThreadPool(int nThreads)：
     返回线程池对象。(创建的是有界线程池,也就是池中的线程个数可以指定最大数量)
总结：
     线程池启动后是不会死亡的，因为后续还要重复使用的。
     void shutdown():会等全部线程执行完毕才关闭。比较友好！
     List<Runnable> shutdownNow()：立即关闭，不管是否执行完毕
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<3; i++){
            System.out.println("线程" + Thread.currentThread().getName()+" => " + i);
        }
    }
}

public class ThreadPoolsDemo01 {
    public static void main(String[] args) {
        // 创建一个线程池:线程池固定放置三个线程
        ExecutorService pools = Executors.newFixedThreadPool(3);
        // 给线程池提交任务,提交任务的时候会自动创建线程对象
        Runnable target = new MyRunnable();
        // 提交任务会自动创建线程对象，并自动启动
        pools.submit(target);
        pools.submit(target);
        pools.submit(target);
        //  这里不会再创建线程了,因为线程池已经满了,这里会复用之前的线程。
        pools.submit(target);

        // 全部线程执行完毕才关闭
        pools.shutdown();
    }
}
