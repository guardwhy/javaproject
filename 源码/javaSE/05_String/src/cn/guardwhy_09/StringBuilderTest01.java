package cn.guardwhy_09;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        // 1.使用无参方式构造StringBuilder类型的对象并打印容量和长度
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1); // 自动调用toString方法 啥也没有
        System.out.println("容量是：" + sb1.capacity()); // 16
        System.out.println("长度是：" + sb1.length()); // 0
        System.out.println("-----------------------");

        // 2.使用参数指定的容量来构造对象并打印容量和长度
        StringBuilder sb2 = new StringBuilder(20);
        // 自动调用toString方法 啥也没有
        System.out.println("sb2 = " + sb2);
        System.out.println("容量是：" + sb2.capacity()); // 20
        System.out.println("长度是：" + sb2.length()); // 0
        System.out.println("----------------------");

        // 3.根据参数指定的字符串内容来构造对象并打印容量和长度
        StringBuilder sb3 = new StringBuilder("hello");
        // 自动调用toString方法  hello
        System.out.println("sb3 = " + sb3);
        System.out.println("容量是：" + sb3.capacity()); // 16 + 5 = 21
        System.out.println("长度是：" + sb3.length()); // 5
        System.out.println("-----------------------");
        String str1 = new String("hello");
        // 转换成大写
        String str2 = str1.toUpperCase();
        System.out.println("str2 = " + str2); // HELLO
        System.out.println("str1 = " + str1); // hello  字符串本身是个常量不会改变
    }
}
