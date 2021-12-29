package cn.guardwhy.cas01;

import java.util.concurrent.atomic.AtomicInteger;

// CAS : 比较并交换 compareAndSet
public class CASDemo02 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2011);
        /*
          期望、更新
          public final boolean compareAndSet(int expect, int update)
          如果期望值达到了，那么就更新，否则就不更新，CAS是CPU的并发原语
        */

        System.out.println("======捣乱的线程========");
        System.out.println(atomicInteger.compareAndSet(2011, 2021));    // true
        System.out.println(atomicInteger.get());    // 2021

        System.out.println(atomicInteger.compareAndSet(2021, 2011));    // true
        System.out.println(atomicInteger.get());    // 2011

        System.out.println("======期待的线程========");
        System.out.println(atomicInteger.compareAndSet(2011, 123)); // true
        System.out.println(atomicInteger.get());    // 123
    }
}
