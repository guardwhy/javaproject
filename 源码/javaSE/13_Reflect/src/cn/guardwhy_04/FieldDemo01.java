package cn.guardwhy_04;

import org.junit.Test;
import java.lang.reflect.Field;

/**
 反射_获取Field成员变量.反射的第一步是先得到Class类对象。
 1、Field getField(String name);
    根据成员变量名获得对应Field对象，只能获得public修饰
 2.Field getDeclaredField(String name);
    根据成员变量名获得对应Field对象，只要申明了就可以得到
 3.Field[] getFields();
    获得所有的成员变量对应的Field对象，只能获得public的
 4.Field[] getDeclaredFields();
 获得所有的成员变量对应的Field对象，只要申明了就可以得到
 */
public class FieldDemo01 {
    @Test
    public void test01(){
        // 1.先获取class类文件,class文件
        Class clazz = Student.class;
        // 2.获取全部成员变量
        Field[] fields = clazz.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f.getName() + "===>" + f.getType());
        }
        /*
        * name===>class java.lang.String
        * age===>int
        * color===>class java.lang.String
          *    school1===>class java.lang.String
         *   school2===>class java.lang.String
        */
    }

    @Test
    public void test02() throws Exception{
        // 1.先获取Class类对象,class文件
        Class clazz = Student.class;
        // 2.获取某个成员变量:根据成员变量的名称定位成员变量对象
        Field name = clazz.getDeclaredField("name");
        System.out.println(name.getName() + "===" + name.getType());    // name===class java.lang.String
    }
}
