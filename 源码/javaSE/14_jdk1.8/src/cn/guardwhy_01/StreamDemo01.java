package cn.guardwhy_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 Stream流作用:可以解决已有集合类库或者数组API的弊端。

总结：Stream流可以简化集合的操作，Stream流提供了强大的元素筛选机制。
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        // 需求:从集合中筛选出所有姓张的人出来。然后再找出姓名长度是3的人。
        Collection<String> list = new ArrayList<>();
        // 添加元素到集合
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // stream流
        System.out.println("stream流(链式编程):");
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s ->s.length() == 3)
                // .forEach(s -> System.out.println(s));
                .forEach(System.out::println);
    }
}
