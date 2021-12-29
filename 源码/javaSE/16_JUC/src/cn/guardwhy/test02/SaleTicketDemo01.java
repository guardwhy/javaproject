package cn.guardwhy.test02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo01 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        // 函数式接口
        new Thread(()->{for(int i = 1; i < 30; i++) ticket.saleTicket();}, "kobe").start();
        new Thread(()->{for(int i = 1; i < 30; i++) ticket.saleTicket();}, "Curry").start();
        new Thread(()->{for(int i = 1; i < 30; i++) ticket.saleTicket(); }, "James").start();
    }
}

/*
 * lock锁使用:
 *   1.new ReentrantLock();
 *   2.Lock.lock(); // 加锁
 *   3. finally=> lock.unlock(); // 解锁
 */
class Ticket{
    private int number = 30;

    // 锁对象
    Lock lock = new ReentrantLock();

    public  void saleTicket(){
        // 加锁操作
        lock.lock();

        try {
            // 条件判断
            if(number > 0){
                System.out.println(Thread.currentThread().getName() + "卖出第" + (number--)
                        + "票, 还剩下:" + number + "张票");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            lock.unlock();
        }
    }
}