package cn.guardwhy.juc01;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo01 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("NBA王朝成立");
        });

        for (int i = 0; i <=7 ; i++) {
            int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "拿到" + temp + "个总冠军");
                try {
                    // 等待操作
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
