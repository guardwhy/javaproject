package cn.guardwhy_02;

import java.util.ArrayList;
import java.util.List;

/**
终结与非终结方法:
    终结方法一旦调用就没有Stream流返回了，操作就结束了。
    非终结方法是每次调用都会返回一个新的Stream流，程序员就可以继续操作。

常见终结方法：foreach count
 */
public class StreamDemo04 {
    public static void main(String[] args) {
        // 创建集合对象list
        List<String> lists = new ArrayList<>();
        // 添加元素到集合
        lists.add("张无忌");
        lists.add("周芷若");
        lists.add("赵敏");
        lists.add("张强");
        lists.add("张三丰");

        lists.stream().filter(s -> s.startsWith("张")).limit(2)
                .forEach(System.out::println);
    }
}
