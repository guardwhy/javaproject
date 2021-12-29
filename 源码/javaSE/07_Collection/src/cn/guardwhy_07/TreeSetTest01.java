package cn.guardwhy_07;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        // 1.准备一个TreeSet集合并打印
        Set<String> s1 = new TreeSet<>();
        System.out.println("s1 = " + s1); // [啥也没有]

        // 2.向集合中添加String类型的对象并打印
        boolean b1 = s1.add("aa");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa]

        b1 = s1.add("cc");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa, cc]

        b1 = s1.add("bb");
        System.out.println("b1 = " + b1); // true
        // 由于TreeSet集合的底层是采用红黑树实现的，因此元素有大小次序，默认从小到大打印
        System.out.println("s1 = " + s1); // [aa, bb, cc]
    }
}
