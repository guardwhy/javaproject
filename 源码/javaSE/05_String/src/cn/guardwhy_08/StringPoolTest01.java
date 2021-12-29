package cn.guardwhy_08;

public class StringPoolTest01 {
    public static void main(String[] args) {
        // 1.验证常量池的存在
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2); // 比较地址 true
    }
}
