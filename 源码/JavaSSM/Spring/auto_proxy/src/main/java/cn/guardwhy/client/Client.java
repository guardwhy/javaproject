package cn.guardwhy.client;

import cn.guardwhy.domain.Landlord;
import cn.guardwhy.domain.Rent;
import cn.guardwhy.proxy.ProxyInvocationHandler;

public class Client {
    public static void main(String[] args) {
        // 1.真实角色
        Landlord landlord = new Landlord();
        // 2.代理角色
        ProxyInvocationHandler pith = new ProxyInvocationHandler();
        // 3.通过调用程序处理角色来处理要调用的接口对象
        pith.setRent(landlord);
        Rent proxy = (Rent) pith.getProxy();
        // 4.调用接口
        proxy.rent();
    }
}
