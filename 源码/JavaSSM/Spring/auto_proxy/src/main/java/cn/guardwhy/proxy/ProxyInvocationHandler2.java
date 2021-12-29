package cn.guardwhy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler2 implements InvocationHandler {
    // 1.被代理的接口
    private Object target;
    // 2.set注入
    public void setTarget(Object target) {
        this.target = target;
    }

    // 3.生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 4.处理代理实例,并且返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用方法
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    // 定义日志方法
    public void log(String msg){
        System.out.println("执行了" + msg + "方法" );
    }
}
