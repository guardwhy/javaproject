package cn.guardwhy.List01;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/*
并发修改异常：java.util.ConcurrentModificationException
*/
public class ListTest02 {
    public static void main(String[] args) {
        // 1.创建list集合
        List<String> list = new ArrayList<>();
        // 2.多线程
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,10));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
