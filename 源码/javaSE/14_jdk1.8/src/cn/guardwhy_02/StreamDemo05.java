package cn.guardwhy_02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 以下若干操作步骤：
     1. 第一个队伍只要名字为3个字的成员姓名；
     2. 第一个队伍筛选之后只要前3个人；
     3. 第二个队伍只要姓张的成员姓名；
     4. 第二个队伍筛选之后不要前2个人；
     5. 将两个队伍合并为一个队伍；
     6. 根据姓名创建`Student`对象；
     7. 打印整个队伍的Student对象信息。
 */
public class StreamDemo05 {
    public static void main(String[] args) {
        // 创建lists集合对象
        List<String> lists1 = new ArrayList<>();
        // 添加元素到集合
        lists1.add("迪丽热巴");
        lists1.add("宋远桥");
        lists1.add("苏星河");
        lists1.add("老子");
        lists1.add("庄子");
        lists1.add("孙子");
        lists1.add("洪七公");

        /**
         1. 第一个队伍只要名字为3个字的成员姓名；
         2. 第一个队伍筛选之后只要前3个人；
         */
        Stream<String> list1 = lists1.stream().filter(s -> s.length() == 3).limit(3);

        List<String> lists2 = new ArrayList<>();
        lists2.add("古力娜扎");
        lists2.add("张无忌");
        lists2.add("张三丰");
        lists2.add("赵丽颖");
        lists2.add("张飞");
        lists2.add("张天爱");
        lists2.add("curry");
        /**
         3. 第二个队伍只要姓张的成员姓名；
         4. 第二个队伍筛选之后不要前2个人；
         5. 将两个队伍合并为一个队伍；
         */
        Stream<String> list2 = lists2.stream().filter(s -> s.startsWith("张")).skip(2);
        // 合并流
        Stream<String> allStream = Stream.concat(list1, list2);

        /**
         6. 根据姓名创建Student对象；
         7. 打印整个队伍的Student对象信息。
         */
        allStream.map(name -> new Student(name)).forEach(System.out::println);
    }
}
