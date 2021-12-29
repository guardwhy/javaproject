package cn.guardwhy_03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo02 {
    public static void main(String[] args) {
        // 1.使用lambda表达式实现函数式接口对象的创建: (参数列表)->{方法体;}
        Runnable runnable = () -> System.out.println("默认方式:" + "无参数无返回值方法");
        runnable.run();
        System.out.println("+++++++++");

        // 2.有参数没有返回值,省略了()、参数类型、{}，自动类型推断
        //Consumer consumer1 = (Object o) -> {System.out.println(o + "有参数没有返回值");};
        //Consumer consumer1 = (o) -> System.out.println(o + "有参数没有返回值");
        Consumer consumer = o -> System.out.println(o + "有参数没有返回值");
        consumer.accept("Consumer接口:");
        System.out.println("+++++++++");

        // 3.无参数有返回值
        //Supplier supplier = () -> {return "无参数有返回值";};
        Supplier supplier = () -> "无参数有返回值";
        // 3.1 无参数有返回值
        System.out.println("Supplier接口:" + supplier.get());
        System.out.println("++++++++++++++");

        // 4.指定的参数执行操作并返回, return 和 {} 都可以省略
        Function function = o ->o;
        System.out.println("Function接口:" + function.apply("有参数有返回值"));
        System.out.println("++++++++++++++");

        // 5.指定的参数是否满足条件
        Predicate predicate = o -> false;
        System.out.println("Predicate接口:" + predicate.test("guardwhy"));
    }
}
