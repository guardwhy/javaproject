package cn.guardwhy.client;

import cn.guardwhy.domain.UserServiceImpl;
import cn.guardwhy.proxy.UserServiceProxy;

public class Client2 {
    public static void main(String[] args) {
        // 1.真实业务
        UserServiceImpl userService = new UserServiceImpl();
        // 2.代理类
        UserServiceProxy proxy = new UserServiceProxy();
        // 3.使用代理类实现日志功能
        proxy.setUserService(userService);
        // 调用方法
        proxy.add();
    }
}
