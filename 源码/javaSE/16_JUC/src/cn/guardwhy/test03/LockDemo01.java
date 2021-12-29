package cn.guardwhy.test03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 精确通知顺序访问
*/
public class LockDemo01 {
    public static void main(String[] args) {
        // 1.创建数据资源对象
        Data data = new Data();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.print1();
            }
        }, "curry").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.print2();
            }
        }, "kobe").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.print3();
            }
        }, "james").start();
    }
}

// 资源类
class Data{
    // 创建锁对象
    private Lock lock = new ReentrantLock();
    // 创建Condition对象
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    // 定义计数器
    private int number = 1;

    // 打印方法
    public void print1(){
        // 调用锁对象
        lock.lock();
        try {
            // 业务，判断->执行-> 通知
            while (number != 1){
                // 等待
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "===>curry");
            // 指定唤醒的线程
            number = 2;
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void print2(){
        // 调用锁对象
        lock.lock();
        try {
            // 业务，判断->执行-> 通知
            while (number != 2){
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName() + "===>kobe");
            // 唤醒指定的线程
            number = 3;
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void print3(){
        // 调用锁对象
        lock.lock();
        try {
            // 业务，判断->执行-> 通知
            while (number != 3){
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName() + "===>james");
            // 唤醒指定的线程
            number = 1;
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
