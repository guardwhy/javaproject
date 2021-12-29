package cn.guardwhy_08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  账户对象
 */
public class Account {
    // 卡号
    private String cardId;
    // 余额
    private double money;

    // 无参构造器
    public Account() {
    }
    // 代参构造器
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    // 创建一把锁对象:必须保证这个对象唯一
    private final Lock lock = new ReentrantLock();

    /***
     * get/set方法
     * @return
     */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 取钱地点方法
    public void drawMoney(double money){
        // 1.先拿到是谁来取钱:拿到当前线程的名字即可，名字是谁就是谁来取钱
        String name = Thread.currentThread().getName();

        // 2.判断余额是否足够,加锁操作
        lock.lock();
        try {
            if(this.money >= money){
                // 钱够了
                System.out.println(name + "来取钱,余额足够,吐出:" + money);
                // 更新余额
                this.money -= money;
                System.out.println(name + "取钱剩余:" + this.money);
            }else {
                // 钱不够
                System.out.println(name + "来取钱,余额不足..");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();  // 解锁操作
        }
    }
}
