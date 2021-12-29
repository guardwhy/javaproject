package cn.guardwhy.singleDemo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
 懒汉式单例
*/
public class LazySingle {
    // 0.定义标志符
    private static boolean flag = false;
    // 1.将构造器私有化
    public LazySingle() {
        synchronized (LazySingle.class){
            // 条件判断
            if(flag == false){
                flag = true;

            }else{
                throw new RuntimeException("反射破坏失败！！！");
            }
        }
    }

    // 2. volatile关键字来避免指令重排
    private volatile static LazySingle lazySingle;
    // 3.双重检查锁模式 懒汉式单例 DCL懒汉式
    public static LazySingle getInstance(){
        // 3.1 条件判断
        if(lazySingle == null){
            synchronized (LazySingle.class){
                if(lazySingle == null){
                    lazySingle = new LazySingle();  // 3.2不是一个原子性操作
                }
            }
        }
        // 4.返回对象
        return lazySingle;
    }

    public static void main(String[] args)  {

        try {
            // 拿到隐藏字段
            Field flag = LazySingle.class.getDeclaredField("flag");
            // 破坏字段的私有权限
            flag.setAccessible(true);

            // 获得反射对象
            Constructor<LazySingle> declaredConstructor = LazySingle.class.getDeclaredConstructor(null);
            // 无视私有构造器
            declaredConstructor.setAccessible(true);
            LazySingle instance1 = declaredConstructor.newInstance();
            // 修改对象1的值
            flag.set(instance1, false);
            // 通过反射创建对象instance2
            LazySingle instance2 = declaredConstructor.newInstance();

            System.out.println(instance1.hashCode());   // 1163157884
            System.out.println(instance2.hashCode());   // 1956725890
            // 判断是否相等
            System.out.println(instance1 == instance2); // false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
