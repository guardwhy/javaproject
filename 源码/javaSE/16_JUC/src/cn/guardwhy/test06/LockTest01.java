package cn.guardwhy.test06;

import java.util.concurrent.TimeUnit;

/*
 * 一个普通同步方法，一个静态同步方法，同一个对象,先发短信还是打电话?
 */
public class LockTest01 {
    public static void main(String[] args) {
       Phone phone1 = new Phone();
       Phone phone2 = new Phone();

        new Thread(()->{
            phone1.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        }, "kobe").start();
    }
}


class Phone{
    // 静态的同步方法:锁的是Class类模板
    public static synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    // 普通的同步方法: 锁的是调用者
    public synchronized void call(){
        System.out.println("打电话...");
    }
}
