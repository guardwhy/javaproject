package cn.guardwhy_08;

public class StringCompareTest06 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("hello");
        System.out.println("str1 = " + str1); // hello

        // 2.使用构造好的对象与其它字符串对象之间比较大小并打印
        System.out.println(str1.compareTo("world"));  // -15
        System.out.println(str1.compareTo("Curry"));   // 37
        System.out.println(str1.compareTo("guardwhy"));   // 1
        System.out.println(str1.compareTo("kobe")); // -3
        System.out.println(str1.compareTo("helloworld")); // -5
        System.out.println(str1.compareToIgnoreCase("HELLO")); // 0
    }
}
