package cn.guardwhy_01;
/**
 多线程的创建有三种方式：
 （1）定义一个线程类继承Thread类，然后重写run()方法，再创建线程对象，调用
 start()方法启动线程

 （2）定义一个线程任务类实现Runnable接口，然后重写run()方法
 创建线程任务对象，把线程任务对象包装成线程对象，调用
 start()方法启动线程

 （3）定义一个线程任务类实现Callable接口（拓展）

方式一的步骤：
     a.定义一个线程类继承Thread类
     b.重写Thread类的run()方法
     c.创建一个子线程对象
     d.调用线程对象的start()方法启动线程（其实最终就是执行线程对象的run()方法）

线程的注意：
 1.启动线程不能直接调用run()方法，否则是普通对象的普通方法调用了，将失去线程特征。线程的启动必须调用start()
 2.一般是先创建子线程，再申明主线程的任务，否则主线程任务总是先执行完！

 优缺点：
 优点：编码简单。
 缺点：线程类已经继承了Thread类，不能再继承其他类，功能被削弱了。
      不能做线程池。无法直接返回线程执行的结果。
 */

//  a.定义一个线程类继承Thread类
class MyThread extends Thread{
    // 重写Thread类的run()方法
    @Override
    public void run() {
        for(int i=0; i < 10; i++){
            System.out.println("子线程执行:" + i);
        }
    }
}

public class ThreadDemo02 {
    public static void main(String[] args) {
        // 创建一个子线程对象
        MyThread t = new MyThread();
        // 启动线程,线程的启动必须调用start()
        t.start();
        // 遍历操作
        for(int i=0; i<10; i++){
            System.out.println("main线程执行:" + i);
        }
    }
}
