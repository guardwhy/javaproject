package cn.guardwhy_04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 多线程的创建的创建方式三
    定义一个线程任务类实现Callable接口。

 创建线程的方式三:
     a.定义一个线程任务类实现Callable接口。
     b.重写call()方法。
     c.把线程任务对象包装成一个未来任务对象。
     d.把未来任务对象包装成一个线程对象。
     e.调用线程对象的start()方法启动线程。
优缺点：
 缺点：编码复杂。
 优点：全是优点。
 可以继续继承其他类。可以做线程池。
 可以得到线程返回的结果。可以做资源共享操作。
 */

//a.定义一个线程任务类实现Callable接口,申明返回值类型
class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        // 定义计数器
        int count = 0;
        for(int i=0; i<10; i++){
            // 1-10的和
            count += (i+1);
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
        return Thread.currentThread().getName()+"求和结果:" + count;
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        // 把线程任务对象包装成一个未来任务对象。
        MyCallable call = new MyCallable();
        /**
         * 未来任务对象： FutureTask
         *  1.可以通过未来任务对象去获取线程执行的结果。
         *  2.未来任务对象其实就是一个Runnable的对象。
         */
        FutureTask<String> target = new FutureTask<>(call);
        // 将未来任务对象包装成一个线程对象
        Thread t1 = new Thread(target);
        // 调用线程对象的start()方法启动线程
        t1.start();

        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }

        try {
            // 线程的执行的结果
            String result = target.get();
            System.out.println("线程执行结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
