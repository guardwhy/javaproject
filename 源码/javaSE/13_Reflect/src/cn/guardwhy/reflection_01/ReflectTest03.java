package cn.guardwhy.reflection_01;

import java.lang.annotation.ElementType;

/*
所有类型的Class
*/
public class ReflectTest03 {
    public static void main(String[] args) {
        Class c1 = Object.class; // 类对象
        Class c2 = Comparable.class; // 接口
        Class c3 = String[].class; // 一维数组
        Class c4 = int[][].class; // 二维数组
        Class c5 = Override.class; // 注解
        Class c6 = ElementType.class; // 枚举
        Class c7 = Integer.class; // 基本数据类型
        Class c8 = void.class; // void
        Class c9 = Class.class; // Class

        System.out.println(c1); // class java.lang.Object
        System.out.println(c2); // interface java.lang.Comparable
        System.out.println(c3); // class [Ljava.lang.String;
        System.out.println(c4); // class [[I
        System.out.println(c5); // interface java.lang.Override
        System.out.println(c6); // class java.lang.annotation.ElementType
        System.out.println(c7); // class java.lang.Integer
        System.out.println(c8); // void
        System.out.println(c9); // class java.lang.Class

        // 只要元素类型与维度是一样的，就是同一个Class
        int[] a1 = new int[10];
        int[] a2 = new int[100];
        System.out.println(a1.getClass().hashCode());   // 1735600054
        System.out.println(a2.getClass().hashCode());   // 1735600054
    }
}
