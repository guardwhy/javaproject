package cn.guardwhy_02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
收集Stream流。
 Stream流的作用是为了帮助操作集合，操作完的数据依然是在Stream流上。
 但是实际开发的时候，数据最终的形式还应该是集合或者数组。

 开发中：集合 -> 通过Stream流辅助操作它 -> 转回成集合（收集Stream流）。

 注意:流只能使用一次
 */
public class StreamDemo06 {
    public static void main(String[] args) {
        // 创建集合对象list
        List<String> lists = new ArrayList<>();
        // 添加元素到集合
        lists.add("张无忌");
        lists.add("周芷若");
        lists.add("赵敏");
        lists.add("张强");
        lists.add("张三丰");
        lists.add("张三丰");

        Stream<String> ss1 = lists.stream().filter(s -> s.startsWith("张") && s.length() == 3);
        // 把流操作完的数据交给一个新的集合：收集Stream流
        List<String> newList = ss1.collect(Collectors.toList());
        System.out.println("list集合:" + newList);

        /**
         * set集合
         */
        Stream<String> ss2 = lists.stream().filter(s -> s.startsWith("张") && s.length() == 3);
        Set<String> newSet = ss2.collect(Collectors.toSet());
        System.out.println("set集合:" + newSet);

        /**
         * 集合转数组
         */
        Stream<String> ss3 = lists.stream().filter(s -> s.startsWith("张") && s.length() == 3);
        Object[] arrs = ss3.toArray();
        System.out.println("数组:" + Arrays.toString(arrs));

        /**
         * 转换成String类型数组
         */
        Stream<String> ss4 = lists.stream().filter(s -> s.startsWith("张") && s.length() == 3);
        // 转换成指定类型
        String[] arr1 = ss4.toArray(String[]::new);
        System.out.println("数组:" + Arrays.toString(arr1));
    }
}
