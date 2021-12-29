package cn.guardwhy_05;
/**
 目标：线程安全问题。

 线程问题的核心原因：多个线程操作同一个共享资源的时候可能出现线程安全问题。

 先模拟一个线程安全问题的案例：转账功能。

 分析：整存整取。
 （1）定义一个账户（余额，卡号）。
 （2）定义一个取钱的线程类
 （3）创建一个账户对象，创建2个线程对象，去这个账户对象取钱10000

总结：
 多个线程操作同一个共享资源的时候可能出现线程安全问题。
 */
public class ThreadSaveDemo01 {
    public static void main(String[] args) {
        // 1.创建一个共享资源:是一个账户对象,这个对象必须只有一个。
        Account acc = new Account("ICBC-162", 10000);
        // 创建2个线程对象代表curry和james
        DrawThread curry = new DrawThread("curry", acc);
        // 启动线程
        curry.start();

        DrawThread james = new DrawThread("james", acc);
        // 启动线程
        james.start();
    }
}
