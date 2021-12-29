package cn.guardwhy_02;
/**
Thread多线程常用API：

 线程是有默认名字的:子线程的名称规则Thread_索引, main线程的默认名称就是main

 1.public void setName(String name):给线程对象取名字。
 2.public String getName():返回线程对象的名字。
 3.public static Thread currentThread(): 获取当前线程对象，这个代码是哪个线程在执行就返回哪个线程对象。
 */

// 定义一个线程类继承Thread类,线程类不是线程对象，是用来创建线程对象的。
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        // 创建一个子线程对象
        MyThread t1 = new MyThread();
        // 设置线程
        t1.setName("1号线程");
        // 启动线程
        t1.start();
        // 输出t1线程对象
        // System.out.println(t1.getName());

        // 创建t2子线程对象
        MyThread t2 = new MyThread();
        t2.setName("2号线程..");
        // 启动线程
        t2.start();
        // 输出t2线程对象
        // System.out.println(t2.getName());

        // 返回当前线程对象,这个代码是哪个线程在执行就返回哪个线程对象。
        Thread main = Thread.currentThread();
        // System.out.println(main.getName());

        main.setName("最牛逼的线程");
        for (int i=0; i< 10; i++){
            System.out.println(main.getName()+ "=>" + i);
        }
    }
}
