package cn.guardwhy_02;

import java.util.ArrayList;
import java.util.List;

/**
 Stream流的常用方法。
 流式编程的核心思想：是把集合或者数组转成Stream流，然后通过调用流的方法，完成各种功能操作。

 Stream流的方法：
     forEach
     count
     filter
     limit
     skip
     map 把传送带上的每个元素进行加工再放上去
     concat：连接流。
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        // 创建集合对象list
        List<String> lists = new ArrayList<>();
        // 添加元素到集合
        lists.add("张无忌");
        lists.add("周芷若");
        lists.add("赵敏");
        lists.add("张强");
        lists.add("张三丰");
        // 遍历集合
        System.out.println("集合遍历:");
        lists.stream().forEach(s -> System.out.println(s));
        System.out.println("================================");

        // 返回传送带上的元素个数
        long nums = lists.stream().filter(s -> s.startsWith("张")).count();
        System.out.println("元素个数:" + nums);
        System.out.println("================================");

        // limit只要前几个
        lists.stream().filter(s -> s.startsWith("周")).limit(2)
                .forEach(System.out::println);
        // skip 跳过前几个
        System.out.println("================================");
        lists.stream().filter(s -> s.startsWith("张")).skip(2)
                .forEach(System.out::println);
    }
}
