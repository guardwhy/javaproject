package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
两部手机、先call还是sendMessage?
*/
public class LockTest03 {
    public static void main(String[] args) {
        // 创建phone对象，两个对象，两个调用者，两把锁
        Phone3 phone1 = new Phone3();
        Phone3 phone2 = new Phone3();

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

// 手机类
class Phone3{
    public synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public synchronized void call(){
        System.out.println("打电话...");
    }

}
