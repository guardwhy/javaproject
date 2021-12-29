package cn.guardwhy.List01;

import java.util.Arrays;
import java.util.List;

/*
单线程安全
*/
public class ListTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("kobe", "curry", "james");
        list.forEach(System.out::println);
    }
}
