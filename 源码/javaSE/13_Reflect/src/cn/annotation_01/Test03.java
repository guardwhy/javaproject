package cn.annotation_01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 自定义注解
*/
public class Test03 {
    // 注解可以显示赋值，如果没有默认值，就必须给注解赋值
    @MyAnnotation3(age = 26, name = "guardwhy")
    public void test01(){}

    @MyAnnotation4("guardwhy")
    public void test02(){

    }
}

// 定义注解
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    // 注解的参数: 参数类型 + 参数名();
    String name() default "";
    int age();
    // 如果默认值为-1,代表不存在.
    int id() default -1;
    String[] schools() default {"计算机工程学院", "中山大学"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation4{
    String value();
}
