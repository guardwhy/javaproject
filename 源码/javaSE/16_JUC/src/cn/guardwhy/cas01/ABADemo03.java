package cn.guardwhy.cas01;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/*
* 解决ABA问题
*/
public class ABADemo03 {
    public static void main(String[] args) {
        // 1. 正常业务操作时候，泛型类型一般都是user对象
        AtomicStampedReference<Integer> atomicStampedReference
                = new AtomicStampedReference<>(1,1); // 两个值: 初始值,初始版本号(初始的时间戳)

        // 2.1CAS：比较并交换
        new Thread(()->{
            // 2.2 获得最新的版本号
            int stamp = atomicStampedReference.getStamp();
            // 拿到最新版本
            System.out.println("a1==>" + stamp);

            try {
                // 2.3 休眠1s
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            atomicStampedReference.compareAndSet(1, 2,
                    // 拿到最新的版本号，版本号+1操作(更新)
                    atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
            // 拿到最新版本号
            System.out.println("a2==>" + atomicStampedReference.getStamp());

            System.out.println(atomicStampedReference.compareAndSet(2, 1,
                    // 拿到最新的版本号，版本号+1操作(更新)
                    atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1));


            // 拿到最新版本号
            System.out.println("a3==>" + atomicStampedReference.getStamp());

        },"a").start();

        new Thread(()->{
            // 获得最新版本号
            int stamp = atomicStampedReference.getStamp();
            System.out.println("b1==>" + stamp);
            try {
                // 休眠2s
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(atomicStampedReference.compareAndSet(1, 66,
                    stamp, stamp + 1));

            System.out.println("b2==>" + atomicStampedReference.getStamp());
        }, "b").start();
    }
}
