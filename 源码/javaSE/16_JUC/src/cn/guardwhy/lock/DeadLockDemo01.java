package cn.guardwhy.lock;

import java.util.concurrent.TimeUnit;

/*
* 死锁
*/
public class DeadLockDemo01 {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";

        new Thread(new MyThread(lockA, lockB), "Curry").start();
        new Thread(new MyThread(lockB, lockA), "Kobe").start();
    }
}

class MyThread implements Runnable{
    // 定义lock锁
    private String lockA;
    private String lockB;

    public MyThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName() + "lock:" + lockA + "==>get "+ lockB);
            try {
                // 休眠2s
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lockB){
                System.out.println(Thread.currentThread().getName() + "lock:" + lockB + "==>get " + lockA);
            }
        }
    }
}
