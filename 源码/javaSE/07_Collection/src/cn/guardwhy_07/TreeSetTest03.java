package cn.guardwhy_07;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        // 4. 匿名比较器对象作为参数传递给构造方法
        /*
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            // 3.1 准备一个比较器对象作为参数传递给构造方法
            public int compare(Student o1, Student o2) {
                // 3.2 表示按照年龄比较
                return o1.getAge() - o2.getAge();
                }
            };
        */
        // 5.从Jdk1.8支持Lambda表达式: (参数列表) -> { 方法体 }
        Comparator<Student> comparator = (Student o1, Student o2)->{
            return o1.getAge() - o2.getAge();
        };

        // 1.准备一个TreeSet集合并放入Student类型的对象
        Set<Student> s1 = new TreeSet<>(comparator);
        // 2.添加到集合
        s1.add(new Student("kobe", 41));
        s1.add(new Student("curry", 10));
        s1.add(new Student("James", 36));
        s1.add(new Student("kobe", 38));
        // 3.输出结果
        System.out.println("s1=" + s1);
        // s1=[Student{name='curry', age=10}, Student{name='James', age=36}, Student{name='kobe', age=38}, Student{name='kobe', age=41}]
    }
}
