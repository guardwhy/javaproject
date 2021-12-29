package cn.guardwhy_08;

public class SubStringTest10 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("Happy Wife, Happy Life!");
        System.out.println("str1 = " + str1); // Happy Wife, Happy Life!

        // 2.获取字符串中的一部分内容并打印
        String str2 = str1.substring(12);
        System.out.println("str2 = " + str2); // Happy Life!
        // 可以取到6但是取不到10
        String str3 = str1.substring(6, 10);
        System.out.println("str3 = " + str3); // Wife

    }
}
