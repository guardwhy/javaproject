package cn.guardwhy_06;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
反射的作用

 可以在运行时得到一个类的全部成分然后操作,可以破坏封装性。
 更重要的用途是适合：做Java高级框架，基本上主流框架都会基于反射设计一些通用功能。
 */

class Mybatis{
    /**
     *  任何对象可以直接保存到文件中去
     */
    public static void save(Object obj) throws Exception{
        // 创建文件字节输出流
        OutputStream os = new FileOutputStream("src/test01/datas.txt", true);
        // 将字节输出流包装成打印流
        PrintStream ps = new PrintStream(os);
        // 拿这个对象的Class类对象
        Class clazz = obj.getClass();
        ps.println("======" + clazz.getSimpleName() + "======");
        // 获取这个类对象的全部成员变量
        Field[] fields = clazz.getDeclaredFields();
        for(Field f : fields){
            // 暴力破解
            f.setAccessible(true);
            // 获取这个成员变量的值
            Object value = f.get(obj);
            // 获取这个成员变量的字段名称
            String name = f.getName();
            ps.println(name + "="+ value);
            ps.flush();
        }
    }
}

public class TestReflect01 {
    public static void main(String[] args) throws Exception{
        // 创建tu对象
        Teacher tu = new Teacher("curry", 10, "打篮球,搞笑话", 100);
        Mybatis.save(tu);

        // 创建pg对象
        Pig pg = new Pig("佩奇", "sh", 200);
        Mybatis.save(pg);

        // 创建dog对象
        Dog dog = new Dog("哮天犬", 12, "黑色");
        Mybatis.save(dog);
    }
}
