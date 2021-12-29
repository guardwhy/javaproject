package cn.guardwhy.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo01 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendMessage();
        }, "curry").start();


        new Thread(()->{
            phone.sendMessage();
        }, "kobe").start();
    }
}

// 手机类
class Phone{
    // 创建lock
    Lock lock = new ReentrantLock();
    // 发短信方法
    public void sendMessage(){
        lock.lock(); // 加锁操作，lock锁必须配对，不然容易出现死锁
        try {
            System.out.println(Thread.currentThread().getName() + "发短信...");
            call(); // 调用call方法，这里也有一把锁
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 释放锁
        }
    }
    // 打电话方法
    public synchronized void call(){
        lock.lock(); // 加锁操作
        try {
            System.out.println(Thread.currentThread().getName() + "打电话...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
