package cn.guardwhy_04;

import org.junit.Test;

import java.lang.reflect.Field;

/**
反射获取成员变量，取值和赋值。

 Field的方法：给成员变量赋值和取值
     void  set(Object obj, Object value)：给对象注入某个成员变量数据
     Object get(Object obj):获取对象的成员变量的值。
     void setAccessible(true);暴力反射，设置为可以直接访问私有类型的属性。
     Class getType(); 获取属性的类型，返回Class对象。
     String getName(); 获取属性的名称。
 */
public class FieldDemo02 {
    @Test
    public void test01(){
        try {
            // 1.创建对象
            Student stu = new Student();
            // 2.得到class对象
            Class clazz = Student.class;
            // 3.获取成员变量
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);
            Field age = clazz.getDeclaredField("age");
            age.setAccessible(true);
            Field color = clazz.getDeclaredField("color");
            color.setAccessible(true);
            // 4.赋值操作
            name.set(stu, "curry");
            age.set(stu, 10);
            color.set(stu, "yellow");

            System.out.println(stu);    // Student{name='curry', age=10, color='yellow'}

            // 5.取值操作
            System.out.println(name.get(stu));
            System.out.println(age.get(stu));
            System.out.println(color.get(stu));
            /*
            * curry
            * 10
            * yellow
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
