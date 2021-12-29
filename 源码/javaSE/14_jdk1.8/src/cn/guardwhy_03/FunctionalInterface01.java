package cn.guardwhy_03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        // 1.匿名内部类的语法格式：父类/接口类型  引用变量名 = new 父类/接口类型(){ 方法的重写 };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("无参数无返回值的方法");
            }
        };
        // 没有参数又没有返回值的方法
        runnable.run();
        System.out.println("++++++++++++");

        // 2.有参数没有返回值
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o + "有参数没有返回值");
            }
        };
        consumer.accept("Consumer接口:");
        System.out.println("++++++++++++");

        // 3.无参数有返回值
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "无参数有返回值";
            }
        };
        // 3.1 无参数有返回值
        System.out.println("Supplier接口:" + supplier.get());
        System.out.println("++++++++++++++");

        // 4.指定的参数执行操作并返回
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return o;
            }
        };
        System.out.println("Function接口:" + function.apply("有参数有返回值"));
        System.out.println("++++++++++++++");

        // 5.指定的参数是否满足条件
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        System.out.println("参数判断:" + predicate.test("guardwhy"));
    }
}
