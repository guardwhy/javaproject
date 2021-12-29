package cn.guardwhy_07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象
 */
public class UserProxy {
    // 代理功能:开始返回一个被代理的对象
    public static UserService getProxyService(UserService userService){
        /**
         *  newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         *  参数一：给类的加载器，用于加载类。
         *  参数二：被代理对象所实现的全部接口，因为被代理的功能都在接口中定义。
         *  参数三：代理对象的处理方法：旅行社的功能。
         */
        return (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), new InvocationHandler() {
                    /**
                     * @param proxy
                     * @param method:当前正要执行的被代理对象的方法
                     * @param args :当前正要执行的被代理对象的方法的参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 代理对象的处理方法,旅行社功能
                        System.out.println("买票办理护照签证...");
                        // 通知用户真正的做自己的事情
                        Object rs = method.invoke(userService, args);
                        System.out.println("注销行程...");
                        return rs;
                    }
                });
    }
}
