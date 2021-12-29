package cn.guardwhy.List01;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/*
并发修改异常：java.util.ConcurrentModificationException
*/
public class MapTest01 {
    public static void main(String[] args) {
       Map<String, String> map = new ConcurrentHashMap<>();
        // 2.多线程
        for (int i = 0; i <= 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
