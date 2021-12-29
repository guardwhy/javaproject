package cn.guardwhy.client;

import cn.guardwhy.domain.UserService;
import cn.guardwhy.domain.UserServiceImpl;
import cn.guardwhy.proxy.ProxyInvocationHandler2;

public class Client2 {
    public static void main(String[] args) {
        //1.真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //2.代理对象的调用处理程序
        ProxyInvocationHandler2 pith = new ProxyInvocationHandler2();
        //3.设置要代理的对象
        pith.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pith.getProxy();
        //4.调用方法
        proxy.add();
    }
}
