package cn.guardwhy.juc01;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
* 独占锁(写锁)：一次只能被一个线程占有
* 共享锁(读锁)：多个线程可以同时占有
* ReadWriteLock
* 读-读   可以共存！！！
* 读-写   不能共存！！！
* 写-写   不能共存！！！
*/
public class ReadWriteLockDemo01 {
    public static void main(String[] args) {
        // 创建MyCache对象
        MyCacheLock myCache = new MyCacheLock();

        // 写入操作
        for (int i = 1; i <=3 ; i++) {
            int temp = i;
            new Thread(()->{
                myCache.put(temp + "", temp+ "");
            }, String.valueOf(i)).start();
        }

        // 读取操作
        for (int i = 1; i <=3 ; i++) {
            int temp = i;
            new Thread(()->{
                myCache.get(temp + "");
            }, String.valueOf(i)).start();
        }
    }
}

/*
加锁自定义缓存
*/
class MyCacheLock{
    // volatile能保证顺序性和可见性，但是不能保证原子性，避免机读重新排序。
    private volatile Map<String, Object> map = new HashMap<>();
    // 读写锁: 更加细粒度的控制
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    // 存，写入操作的时候，只希望同时只有一个线程写入
    public void put(String key, Object value){
        // 加锁操作
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "写入" + key);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 解锁
            readWriteLock.writeLock().unlock();
        }
    }

    // 取，读操作，所有人都可以读取
    public void get(String key){
        // 加锁
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "读取" + key);
            Object o = map.get(key);
            System.out.println(Thread.currentThread().getName() + "读取成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
}
