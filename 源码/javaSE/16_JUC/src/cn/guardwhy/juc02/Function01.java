package cn.guardwhy.juc02;

import java.util.function.Function;
/*
Function 函数型接口,只有一个参数输入，有一个参数输出
只要是函数型接口，都可以用lambda表达式简化
*/
public class Function01 {
    public static void main(String[] args) {
        /*Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String str) {
                return str;
            }
        };*/

        Function<String, String> function = (str)->{
            return str;
        };

        // 输出结果
        System.out.println(function.apply("hello world!!!"));
    }
}
