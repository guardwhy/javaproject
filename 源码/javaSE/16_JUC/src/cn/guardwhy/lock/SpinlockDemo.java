package cn.guardwhy.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class SpinlockDemo {
    // 1.原子引用线程
    AtomicReference<Thread> atomicReference = new AtomicReference<>();
    // 2.加锁操作
    public void myLock(){
        Thread thread = Thread.currentThread();// 获取线程
        System.out.println(Thread.currentThread().getName() + "==>myLock");

        // 3.自旋
        while (!atomicReference.compareAndSet(null, thread)){

        }
    }
    // 4. 解锁操作
    public void myUnLock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + "==>myUnLock");
    }

    public static void main(String[] args) {
        // 创建自旋锁对象,底层使用自旋锁CAS
        SpinlockDemo spinlock = new SpinlockDemo();

        new Thread(()->{
            // 加锁
            spinlock.myLock();
            try {
                // 休眠3s
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 解锁
                spinlock.myUnLock();
            }
        }, "Curry").start();


        try {
            // 休眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            // 加锁
            spinlock.myLock();
            try {
                // 休眠1s
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 解锁
                spinlock.myUnLock();
            }
        }, "Kobe").start();
    }
}
