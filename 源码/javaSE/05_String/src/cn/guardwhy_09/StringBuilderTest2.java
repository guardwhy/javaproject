package cn.guardwhy_09;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        String name = "guardwhy";
        name += "欢迎";
        name += "您！";
        System.out.println(name);

        StringBuilder sb = new StringBuilder();
        // 拼接字符串！！
        sb.append("guardwhy");
        sb.append("欢迎");
        sb.append("您！");
//        System.out.println(sb.toString());
        System.out.println(sb);

        // StringBuilder支持链式编程。
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java").append("是世界上").append("最牛逼").append("的语言！");
        String rs = sb1.toString();
        System.out.println(rs);
    }
}
