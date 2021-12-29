package cn.guardwhy.cas01;

import java.util.concurrent.atomic.AtomicInteger;

/*
CAS : 比较并交换 compareAndSet
*/
public class CASDemo01 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2011);
        /*
          源码示例 参数: 期望值 更新值
          public final boolean compareAndSet(int expect, int update) {
                return unsafe.compareAndSwapInt(this, valueOffset, expect, update);
            }
        */
        // 期望值是 2011 ,后来改为2021 所以结果为2021
        System.out.println(atomicInteger.compareAndSet(2011, 2021)); // true
        System.out.println(atomicInteger.get()); // 2021

        // 期望值是2011,后改为1024 所以最终结果为false 2021
        System.out.println(atomicInteger.compareAndSet(2011, 1024)); // false
        System.out.println(atomicInteger.get()); // 2021

        atomicInteger.getAndIncrement();
    }
}
