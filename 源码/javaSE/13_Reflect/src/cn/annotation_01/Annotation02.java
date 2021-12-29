package cn.annotation_01;

import java.lang.annotation.*;

public class Annotation02 {
    public void test(){

    }
}

// 1.定义一个注解
// Target 表示注解可以用到什么地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// 2.Retention 注解在什么地方还有效
// runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)

// 3.Deprecated 表示是否将注解生成在Javadoc中
@Deprecated

// 4.Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
