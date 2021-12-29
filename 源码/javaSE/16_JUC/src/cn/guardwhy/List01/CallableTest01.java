package cn.guardwhy.List01;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest01 {
    public static void main(String[] args) throws Exception {
        /*
        * 步骤:
        * 1. new Thread(new Runable()).start;
        * 2. new Thread(new FutureTask<V>()).start;
        * 3. new Thread(new FutureTask<V>(Callable)).start;
        */

        // 创建线程对象
        MyThread thread = new MyThread();
        // 适配类：未来任务对象 FutureTask
        FutureTask futureTask = new FutureTask(thread);
        // 线程操作
        new Thread(futureTask, "kobe").start();
        // 第二次调用执行，会有结果缓存，不用再次计算
        new Thread(futureTask, "curry").start();

        // 获取操作，get方法可能会产生阻塞，放到最后
        Integer result = (Integer) futureTask.get();
        System.out.println(result);
    }
}

class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("call方法被调用");
        // 耗时操作
        return 666;
    }
}
