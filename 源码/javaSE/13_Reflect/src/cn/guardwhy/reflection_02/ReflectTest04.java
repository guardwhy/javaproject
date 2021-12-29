package cn.guardwhy.reflection_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
* 通过反射,动态创建对象
*/
public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        // 1.1获得Class对象
        Class c1 = Class.forName("cn.guardwhy.reflection_02.User");
        // 1.2 构造一个对象
        User user1 = (User) c1.newInstance(); // 本质是调用了类的无参构造器
        System.out.println(user1);   // User{id=0, age=0, name='null'}
        System.out.println("===========");

        // 2.1 通过构造器创建对象
         Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
         User user2 = (User) constructor.newInstance("guardwhy", 1, 26);
         System.out.println(user2); // User{id=1, age=26, name='guardwhy'}
         System.out.println("===========");

        // 3.1 通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        // 3.2 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // 3.3 invoke: 激活的意思,(对象，"方法的值")
        setName.invoke(user3, "guardwhy");
        System.out.println(user3.getName());    // guardwhy

        // 4.1 通过反射操作属性
        System.out.println("===========");
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        // 4.2 不能直接操作私有属性，暴力破解
        name.setAccessible(true);
        name.set(user4, "Curry");
        System.out.println(user4.getName());
    }
}
