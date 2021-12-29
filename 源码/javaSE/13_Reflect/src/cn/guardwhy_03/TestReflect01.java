package cn.guardwhy_03;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
反射_获取Constructor构造器对象.反射的第一步是先得到Class类对象。

反射中Class类型获取构造器提供了很多的API:
     1. Constructor getConstructor(Class... parameterTypes)
        根据参数匹配获取某个构造器，只能拿public修饰的构造器，几乎不用！
     2. Constructor getDeclaredConstructor(Class... parameterTypes)
        根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
     3. Constructor[] getConstructors()
        获取所有的构造器，只能拿public修饰的构造器。几乎不用！！太弱了！
     4. Constructor[] getDeclaredConstructors()
        获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
总结：
     获取全部构造器，建议用getDeclaredConstructors();
     获取某个构造器，建议用getDeclaredConstructor(Class... parameterTypes)
     他们都无所谓权限，只要申明了就可以去取！！反射是破环封装性的！！
 */
public class TestReflect01 {
     @Test
     public void getConstructors(){
         // 1.反射第一步先得到Class类对象
         Class clazz = Student.class;
         // 2.getConstructors():获取全部的构造器，只能拿public修饰的构造器。
         Constructor[] cons1 = clazz.getConstructors();
         // 遍历操作
         for(Constructor c : cons1){
             System.out.println(c.getName() + " ==" + c.getParameterCount());
         }
         /*
         * cn.guardwhy_03.Student ==0
         * cn.guardwhy_03.Student ==2
         */

         // 3.getDeclaredConstructors(): :获取全部的构造器,主要你写了就可以拿到,无所谓权限。
         Constructor[] cons2 = clazz.getDeclaredConstructors();
         // 4.遍历操作
         for(Constructor c : cons2){
             System.out.println(c.getName() + " ==" + c.getParameterCount());
         }

         /*
         * cn.guardwhy_03.Student ==0
         *  cn.guardwhy_03.Student ==2
         */
     }

     @Test
    public void getConstructor() throws Exception{
         // 1.反射的第一步先得到Class对象
         Class clazz = Student.class;
         // 2.拿到两个参数的构造器
         Constructor c1 = clazz.getDeclaredConstructor(String.class, int.class);
         System.out.println(c1.getName() + " ==" + c1.getParameterCount());  // cn.guardwhy_03.Student==2

         // 3.定位无参数构造器
         Constructor c2 = clazz.getDeclaredConstructor();   // 只要申明了就可以定位获取
         System.out.println(c2.getName() + " ==" + c1.getParameterCount()); // cn.guardwhy_03.Student ==2
     }
}
