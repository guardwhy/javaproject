package cn.guardwhy_09;
/*
    实现字符串内容的修改、查找以及反转操作
*/
public class StringBuilderTest5 {
    public static void main(String[] args) {
        // 1.创建sb对象
        StringBuilder sb = new StringBuilder("1234");
        // 2.表示将下标为0这个位置的字符修改为'a'
        sb.setCharAt(0, 'a');
        System.out.println("修改单个字符后的内容是：" + sb); // a234
        // 3.修改"234"为"bcd"
        sb.replace(1, 4, "bcd");
        System.out.println("修改字符串后的结果是：" + sb); // abcd
        // 4.实现查找的功能
        int pos = sb.indexOf("b");
        System.out.println("从前向后查找的结果是：" + pos); // 1
        pos = sb.lastIndexOf("b");
        System.out.println("从后向前查找的结果是：" + pos); // 1
        // 5.实现字符串的反转功能
        sb.reverse();
        System.out.println("反转后的结果是：" + sb); // dcba
    }
}
