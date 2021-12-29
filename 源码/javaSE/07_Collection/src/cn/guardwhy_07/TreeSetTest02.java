package cn.guardwhy_07;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {

        // 1.准备一个TreeSet集合并放入Student类型的对象
        Set<Student> s1 = new TreeSet<>();
        // 2.添加到集合
        s1.add(new Student("kobe", 41));
        s1.add(new Student("curry", 10));
        s1.add(new Student("James", 36));
        s1.add(new Student("kobe", 38));
        // 3.输出结果
        System.out.println("s1=" + s1);
    }
}
