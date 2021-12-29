package cn.guardwhy.singleDemo02;

import java.lang.reflect.Constructor;

public enum  EnumSingleton {
    // 定义一个单例对象
   INSTANCE;
   public EnumSingleton getInstance(){
       // 返回对象
       return INSTANCE;
   }

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        try {
            // 获得反射对象
            Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
            // 破解私有构造器
            declaredConstructor.setAccessible(true);
            // 通过反射创建对象singleton2
            EnumSingleton singleton2 = declaredConstructor.newInstance();

            // 输出结果
            System.out.println(singleton1);
            System.out.println(singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
