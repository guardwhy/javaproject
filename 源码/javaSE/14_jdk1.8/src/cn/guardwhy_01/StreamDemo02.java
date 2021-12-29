package cn.guardwhy_01;

import java.util.*;
import java.util.stream.Stream;

/**
 Stream流的获取
 流式思想的核心：是先得到集合或者数组的Stream流（就是一根传送带）
               然后就在用这个Stream流操作集合或者数组的元素。
               Stream流简化替代集合操作的API.

集合获取流的API:
    (1)default Stream<E> stream();

 */
public class StreamDemo02 {
    public static void main(String[] args) {
        /*
        * Collection集合获取Stream流
        */
        Collection<String> lists = new ArrayList<>();
        Stream<String> ss = lists.stream();

        /**
         * Map集合获取流
         */
        Map<String, Integer> map = new HashMap<>();
        // 先获取键的Stream流
        Stream<String> keys = map.keySet().stream();
        // 在获取值的Stream流
        Stream<Integer> values = map.values().stream();
        // 获取键值对的Stream流
        Stream<Map.Entry<String, Integer>> keyAndValues = map.entrySet().stream();

        /**
         * 数组获取流
         */
        String[] arrs = new String[]{"Java", "Spring Boot", "Python"};
        Stream<String> arr1 = Arrays.stream(arrs);
        Stream<String> ars2 = Stream.of(arrs);
    }
}
