package cn.guardwhy.proxy;

import cn.guardwhy.domain.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
// 该类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    // 1.被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 2.生成得到代理类

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(), this);
    }

    // 3.处理代理实例，并且返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        // 动态代理的本质。就是使用反射机制实现
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }
    // 4.方法
    public void seeHouse(){
        System.out.println("带房客看房...");
    }
    // 收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
