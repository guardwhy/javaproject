package cn.guardwhy_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 Stream接口的静态方法: concat:连接流。
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        // 创建集合对象list
        List<String> lists = new ArrayList<>();
        // 添加元素到集合
        lists.add("Curry");
        lists.add("James");
        lists.add("Rondo");
        lists.add("Duncan");
        lists.add("kobe");

        // 实例化数组
        String[] arrs = new String[]{"java", "javaEE", "Spring Boot", "spring cloud"};
        // 集合的流
        Stream<String> listStream = lists.stream();
        // 数组的流
        Stream<String> arrsStream = Arrays.stream(arrs);

        // 合并流
        Stream<String> allStream = Stream.concat(listStream, arrsStream);
        System.out.println("数组元素个数:" + allStream.count());
    }
}
