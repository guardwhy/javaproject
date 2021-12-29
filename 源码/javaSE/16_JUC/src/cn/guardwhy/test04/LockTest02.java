package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
* 标准访问：先发短信还是打电话?
* 发短信延迟5s,谁先访问?
*/
public class LockTest02 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone2 phone2 = new Phone2();

        new Thread(()->{
            phone2.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.test();
        }, "kobe").start();
    }
}

// 手机类
class Phone2{
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
        System.out.println("打电话...");
    }
    // 普通方法
    public void test(){
        System.out.println("hello world!!!");
    }
}
