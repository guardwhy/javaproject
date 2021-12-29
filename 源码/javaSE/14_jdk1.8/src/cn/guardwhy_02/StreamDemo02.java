package cn.guardwhy_02;
import java.util.ArrayList;
import java.util.List;

/**
 Stream流的方法：
     map:把传送带上的每个元素进行加工再放上去。
 */
public class StreamDemo02 {
    public static void main(String[] args) {
        // 创建集合对象list
        List<String> lists = new ArrayList<>();
        // 添加元素到集合
        lists.add("Curry");
        lists.add("James");
        lists.add("Rondo");
        lists.add("Duncan");
        lists.add("kobe");

        // 给每个名称都加上一个前缀,前缀是超级球星。
        lists.stream().map(s -> "超级球星: " + s).forEach(System.out::println);
        // 把每一个学生名称都加工成一个学生对象。
        lists.stream().map(s -> new Student(s)).forEach(System.out::println);
    }
}
