package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
 * 两个静态同步方法，同一部手机,先发短信还是打电话?
 */
public class LockTest05 {
    public static void main(String[] args) {
        // 两个对象的Class类模板只有一个，Static,锁的是Class.
        Phone5 phone1 = new Phone5();
        Phone5 phone2 = new Phone5();

        new Thread(()->{
            phone1.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        }, "kobe").start();
    }
}

// Phone4是唯一的class对象
class Phone5{
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
