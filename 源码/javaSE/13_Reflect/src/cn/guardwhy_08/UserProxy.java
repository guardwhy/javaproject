package cn.guardwhy_08;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;

/**
 * 代理对象..
 */
public class UserProxy {
    // 代理功能
    public static <T> T getProxyService(Object obj){
        // 开始返回一个被代理的对象

        /**
         *  newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         *  参数一：给类的加载器，用于加载类,创建一个新的被代理对象
         *  参数二：被代理对象所实现的全部接口，因为被代理的功能都在接口中定义。
         *  参数三：代理对象的处理方法
         */
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new InvocationHandler() {
                    /***
                     * @param proxy
                     * @param method:当前正要执行的被代理对象的方法
                     * @param args
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 方法执行的开始时间点
                        long startTime = System.currentTimeMillis();
                        // 通知用户做自己的事情
                        Object rs = method.invoke(obj, args);
                        // 结束时间
                        long endTime = System.currentTimeMillis();
                        // 时间日期格式化
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        System.out.println(method.getName() + "方法执行完毕->" + sdf.format(endTime) +
                                ", 耗时:" + (endTime - startTime) / 1000.0 + "s");
                        return rs;
                    }
                });
    }
}
