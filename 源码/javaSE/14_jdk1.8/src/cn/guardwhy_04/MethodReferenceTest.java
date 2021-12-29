package cn.guardwhy_04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        // 1.1方法调用
        Person person = new Person("kobe", 41);
        // 1.1 lambda表达式实现Person类中show方法调用
        Runnable runnable1 = ()-> person.show();
        runnable1.run();
        // 1.2 使用方法引用实现Person类中show方法调用
        Runnable runnable2 = person::show;
        runnable2.run();
        System.out.println("+++++++++++");

        // 2.1 使用lambda表达式方式实现Person类中setName方法调用
        Consumer<String> consumer1 = s-> person.setName(s);
        consumer1.accept("Curry");
        System.out.println("person=" + person);
        // 2.2 使用方法引用的方式实现Person类中setName方法的调用
        Consumer<String> consumer2 = person::setName;
        consumer2.accept("james");
        System.out.println("person=" + person);
        System.out.println("+++++++++++");

        // 3.通过函数式接口Supplier方法来实现Person类中getName方法调用
        Supplier<String> supplier1 = ()->person.getName();
        System.out.println(supplier1.get());    // james

        Supplier<String> supplier2 = person::getName;
        System.out.println(supplier2.get()); // james
        System.out.println("+++++++++++++");

        // 4.通过函数式接口Function中的方法实现Integer类中parseInt方法调用
        Function<String, Integer> function1 = s -> Integer.parseInt(s);
        System.out.println(function1.apply("12345")); // 12345
        Function<String, Integer> function2 = Integer::parseInt;
        System.out.println(function2.apply("12345")); // 12345
        System.out.println("+++++++++++++++");

        // 9.通过函数式接口Comparator方法实现Integer类中compare方法调用
        Comparator<Integer> comparator1 = (o1, o2) ->Integer.compare(o1, o2);
        System.out.println(comparator1.compare(10, 20)); // -1

        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println(comparator2.compare(10, 20));
        System.out.println("+++++++++++++++");

        // 10.通过BiFunction函数式接口采用有参方式创建Person类型对象并返回
        BiFunction<String, Integer, Person> biFunction1 = (s, integer) -> new Person(s, integer);
        System.out.println(biFunction1.apply("Ross", 30));

        BiFunction<String, Integer, Person> biFunction2 = Person::new;
        System.out.println(biFunction2.apply("Ross", 21));
        System.out.println("+++++++++++++++");

        // 11.通过Function函数式接口创建指定数量的Person类型的对象数组并返回
        Function<Integer, Person[]> function3 = integer -> new Person[integer];
        System.out.println(Arrays.toString(function3.apply(4)));

        Function<Integer, Person[]> function4 = Person[]::new;
        System.out.println(Arrays.toString(function4.apply(5)));
    }
}
