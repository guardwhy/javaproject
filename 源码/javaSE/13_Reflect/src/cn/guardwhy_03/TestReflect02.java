package cn.guardwhy_03;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
反射_获取Constructor构造器然后通过这个构造器创建对象。

 Constructor的API:
     1. T newInstance(Object... initargs)
        创建对象，注入构造器需要的数据。
     2. void setAccessible(true)
        修改访问权限，true暴力攻破权限，false表示保留不可访问权限(暴力反射)
总结：
    Constructor对象可以调用newInstance得到一个类的对象。反射是破坏了封装性！！！
 */
public class TestReflect02 {
    @Test
    public void createObj1() throws Exception{
        // 需求:使用反射调用无参数构造器创建一个对象。
        // 1.得到Class类对象
        Class clazz = Student.class;
        // 2.定位无参数构造器
        Constructor cons1 = clazz.getDeclaredConstructor();
        // 3.通过无参数构造器调用自己的newInstance方法创建一个对象
        cons1.setAccessible(true); // 暴力打开权限
        // 4.调用无参构造器
        Student s = (Student) cons1.newInstance();
        // 5.输出对象
        System.out.println(s);  // Student{name='null', age=0}
    }

    @Test
    public void createObj2() throws Exception{
        // 需求:使用反射调用有参数构造器创建一个对象。
        // 1.得到Class对象
        Class clazz = Student.class;
        // 2.定义无参构造器
        Constructor cons2 = clazz.getDeclaredConstructor(String.class, int.class);
        // 3.通过无参数构造器调用自己的newInstance方法创建一个对象
        Student s = (Student)cons2.newInstance("curry", 10);
        // 输出对象
        System.out.println("对象属性:" + s);    // 对象属性:Student{name='curry', age=10}
    }
}
