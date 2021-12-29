package cn.guardwhy_02;
/**
 目标：通过有参数构造器为线程对象取名字（拓展）
 Thread父类的有参数构造器： public Thread(String name):
 */

// 定义一个线程类继承Thread类
class MyThread02 extends Thread{
    // 代参构造器
    public MyThread02(String name) {
        super(name);
    }

    // 重写Thread类的run()方法
    @Override
    public void run() {
       for(int i=0; i<10; i++){
           System.out.println(Thread.currentThread().getName() + "=>" + i);
       }
    }
}

public class ThreadDemo02 {
    public static void main(String[] args) {
        // 创建一个子进程对象
        MyThread02 t1 = new MyThread02("1号线程");
        // 启动线程
        t1.start();

        MyThread02 t2 = new MyThread02("2号线程");
        // 启动线程
        t2.start();

        // 获取当前线程对象
        Thread main = Thread.currentThread();
        for(int i=0; i<10; i++){
            System.out.println(main.getName() + "=>"+i);
        }
    }
}
