package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
 * 两个静态同步方法，同一部手机,先发短信还是打电话?
 */
public class LockTest04 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone5 phone4 = new Phone5();

        new Thread(()->{
            phone4.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone4.call();
        }, "kobe").start();
    }
}

// Phone4是唯一的class对象
class Phone4 {
    /*
    * synchronized锁的对象是方法的调用者，static是静态方法。
    * 静态方法类一加载就有了！！锁的是Class
    */
    public static synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public static synchronized void call(){

        System.out.println("打电话...");
    }
}
