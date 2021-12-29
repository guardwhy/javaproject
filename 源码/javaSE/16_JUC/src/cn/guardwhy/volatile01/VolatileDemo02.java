package cn.guardwhy.volatile01;

import java.util.concurrent.atomic.AtomicInteger;

// volatile 不保证原子性
public class VolatileDemo02 {
    // 原子类的Integer
    private volatile static AtomicInteger num = new AtomicInteger();

    public static void add(){
        num.getAndIncrement(); // AtomicInteger + 1 方法， CAS
    }

    public static void main(String[] args) {
        // 1.理论上num的值应该为2w
        for (int i = 1; i <= 20 ; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    // 2.调用方法
                    add();
                }
            }).start();
        }

        while (Thread.activeCount()>2){
            // 礼让
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName() + " " + num);
    }
}
