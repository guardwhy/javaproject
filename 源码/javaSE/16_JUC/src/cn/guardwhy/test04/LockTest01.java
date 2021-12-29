package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
* 标准访问：先发短信还是打电话?
* 发短信延迟5s,谁先访问?
*/
public class LockTest01 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone.call();
        }, "kobe").start();
    }
}

// 手机类
class Phone{
    public synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public synchronized void call(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("打电话...");
    }
}
