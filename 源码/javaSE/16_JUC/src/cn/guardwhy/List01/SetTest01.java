package cn.guardwhy.List01;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetTest01 {
    public static void main(String[] args) {
        /*
         解决方案:
         1. Set<String> set = Collections.synchronizedSet(new HashSet<>());
         2. Set<String> set = new CopyOnWriteArraySet<>();
         */

        // 1.创建Set集合
        Set<String> set = new HashSet<>();
        // 2.多线程
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,10));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }
}
