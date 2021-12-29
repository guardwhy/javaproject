package cn.guardwhy_03;
/**
多线程的创建的创建方式二。
（1)定义一个线程任务类实现Runnable接口，然后重写run()方法.
 创建线程任务对象，把线程任务对象包装成线程对象，调用start()方法启动线程

 方式二:
     a.定义一个线程任务类实现Runnable接口。重写run()方法
     b.创建一个线程任务对象
     c.把线程任务对象包装成一个线程对象
     -- public Thread(Runnable target)
     d.调用线程对象的start()方法启动线程。

 优缺点：
 缺点：编程相对复杂，不能直接返回线程的执行结果
 优点：
     1. 一个任务对象可以被反复包装成多个线程对象。
     2. 可以避免java中的单继承的局限性。因为线程任务对象只是实现了接口，还可以继续继承其他类和实现其他接口。
     3. 实现解耦操作，线程任务对象代码可以被多个线程共享，代码和线程独立。
     4. 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类。
     适合做线程池。
 */

// 定义一个线程任务类实现Runnable接口。
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        // 创建一个线程任务对象
        Runnable target = new MyRunnable();
        // 将线程任务对象包装成线程对象
        Thread t1 = new Thread(target);
        // 启动线程
        t1.start();

        // 创建线程对象
        Thread t2 = new Thread(target);
        // 启动线程
        t2.start();

        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + "=>"+i);
        }
    }
}
