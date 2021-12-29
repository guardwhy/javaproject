package cn.guardwhy.reflection_02;

import java.lang.reflect.Method;

/*
* 性能测试
*/
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        // 调用方法
        test01();
        test02();
        test03();
    }

    // 1.普通方法
    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        // 遍历操作
        for (int i = 0; i < 100000000; i++) {
            user.getName();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次数:" + (endTime - startTime) + "ms");
    }

    // 2.反射方法调用
    public static void test02() throws Exception {
        User user = new User();
        // 得到c1类对象
        Class c1 = user.getClass();
        long startTime = System.currentTimeMillis();
        // 拿到方法
        Method getName = c1.getDeclaredMethod("getName", null);
        for (int i = 0; i < 100000000; i++) {
            // 激活方法
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次数:" + (endTime - startTime) + "ms");
    }

    // 反射方式，关闭检查
    public static void test03() throws Exception {
        User user = new User();
        // 得到c1类对象
        Class c1 = user.getClass();
        long startTime = System.currentTimeMillis();
        // 拿到方法
        Method getName = c1.getDeclaredMethod("getName", null);
        // 暴力破解
        getName.setAccessible(true);
        for (int i = 0; i < 100000000; i++) {
            // 激活方法
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式(关闭检查)执行10亿次数:" + (endTime - startTime) + "ms");
    }
}
