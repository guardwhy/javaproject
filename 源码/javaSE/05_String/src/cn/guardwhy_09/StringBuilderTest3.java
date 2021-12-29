package cn.guardwhy_09;
/*
StringBuilder和String相互转换
*/
public class StringBuilderTest3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello").append(" world");

        // 1. StringBuilder 转 String
        String s  = sb1.toString();
        System.out.println(s);  // hello world

        // 2. String 转 StringBuilder
        String str = "hello java";
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println(sb2); // hello java
    }
}
