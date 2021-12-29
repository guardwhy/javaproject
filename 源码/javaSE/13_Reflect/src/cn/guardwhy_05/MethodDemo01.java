package cn.guardwhy_05;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 反射获取类的Method方法对象：
    1、Method getMethod(String name,Class...args);
        根据方法名和参数类型获得对应的方法对象，只能获得public的

    2、Method getDeclaredMethod(String name,Class...args);
        根据方法名和参数类型获得对应的方法对象，包括private的

    3、Method[] getMethods();
        获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的

    4、Method[] getDeclaredMethods();
        获得类中的所有成员方法对象，返回数组,只获得本类申明的方法。

Method的方法
     Object invoke(Object obj, Object... args)
     * 触发的是哪个对象的方法执行。
     * args：调用方法时传递的实例参数
 */
public class MethodDemo01 {
    @Test
    public void getAllMethods() throws Exception{
        // 1.获取全部方法
        System.out.println("======获取全部方法============");
        Class clazz = Dog.class;
        Method[] ms = clazz.getDeclaredMethods();
        // 遍历操作
        for(Method m : ms){
            System.out.println(m.getName() + "==>" + m.getParameterCount());
        }
        /*
        * ======获取全部方法============
        * run==>0
        * getName==>0
        * setName==>1
        * eat==>1
        * inAddr==>0
        */

        System.out.println("======获取某个方法============");
        // 2.获取某个方法
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(eat.getName() + "==>" + eat.getParameterCount());  // eat==>1
    }

    @Test
    public void methodInvoke() throws Exception{
        // 1.定位方法的目的是为了执行
        Class clazz = Dog.class;
        Method eat = clazz.getDeclaredMethod("eat", String.class);

        // 暴力打开
        eat.setAccessible(true);
        // 创建对象
        Dog dog = new Dog("泰迪");
        Object rs = eat.invoke(dog, "骨头");  // 狗吃骨头
        System.out.println("rs:" + rs); // rs:null

        Method getName = clazz.getDeclaredMethod("getName");
        Object rs1 = getName.invoke(dog);
        System.out.println("rs1:" + rs1);   // rs1:泰迪

    }
}
