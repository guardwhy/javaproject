package cn.guardwhy_08;

public class StringCharTest05 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("hello");
        // hello
        System.out.println("str1 = " + str1);

        // 2.获取字符串的长度和每个字符并打印
        System.out.println("字符串的长度是：" + str1.length()); // 5
        System.out.println("下标为0的字符是：" + str1.charAt(0)); // h
        System.out.println("下标为1的字符是：" + str1.charAt(1)); // e
        // StringIndexOutOfBoundsException 字符串下标越界异常
        //System.out.println("下标为5的字符是：" + str1.charAt(5));
        System.out.println("---------------------");

        // 3.使用for循环获取所有字符
        for (int i = 0; i < str1.length(); i++) {
            // h e l l o
            System.out.println("下标为" + i + "的字符是：" + str1.charAt(i));
        }
        System.out.println("----------------------------");

        // 4.判断字符串是否为空
        System.out.println(0 == str1.length()? "字符串为空": "字符串不为空"); // 不为空
        System.out.println(str1.isEmpty()? "字符串为空": "字符串不为空");     // 不为空
        System.out.println("------------------------");

        // 5.使用两种方式实现字符串"12345"转换为整数12345并打印
        String str2 = new String("12345");
        // 方式一：调用Integer类中的parseInt()方法即可
        int i1 = Integer.parseInt(str2);
        System.out.println("转换整数：" + i1); // 12345

        // 方式二：利用ASCII来实现类型转换并打印
        int i2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            // 1 12 ...
            i2 = i2 * 10 + (str2.charAt(i) - '0');
        }
        // 12345
        System.out.println("转换整数：" + i2);
        System.out.println("-------------------");

        // 如何实现整数到字符串的转换
        //String str3 = String.valueOf(i2);
        String str3 = "" + i2; // 推荐使用
        System.out.println("str3 = " + str3); // 12345
    }
}
