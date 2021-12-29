package cn.guardwhy.List01;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/*
并发下Arraylist是不安全的
*/
public class ListTest03 {
    public static void main(String[] args) {
        /*
        * 解决方案:
        * 1. List<String> list = new Vector<>();
        * 2. List<String> list = Collections.synchronizedList(new ArrayList<>());
        * 3. List<String> list = new CopyOnWriteArrayList<>();
        */

        // 1.创建list集合
        // CopyOnWrite 写入时复制
        List<String> list = new CopyOnWriteArrayList<>();
        // 2.多线程
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,10));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
