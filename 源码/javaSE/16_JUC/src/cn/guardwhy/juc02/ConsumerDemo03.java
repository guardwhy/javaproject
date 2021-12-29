package cn.guardwhy.juc02;

import java.util.function.Consumer;
/*
Consumer消费型接口:只有输入，没有返回值
*/
public class ConsumerDemo03 {
    public static void main(String[] args) {
        /*Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };*/

        Consumer<String> consumer = str->{
            System.out.println(str);
        };
        consumer.accept("hello world!!!");
    }
}
