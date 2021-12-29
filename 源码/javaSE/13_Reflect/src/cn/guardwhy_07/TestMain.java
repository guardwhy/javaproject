package cn.guardwhy_07;
/**
动态代理的使用

 业务对象：完全是自己去实现的。
 业务对象能否找到一个代理，相同的东西交给代理集中解决，需要自己完成的就自己去做！

 核心：把业务对象  -> 转成被代理的业务对象

 做一个代理：（完成出国，通知别人做自己的操作，最后注销）
 把业务对象包装成一个被代理的业务对象返回。
 以后再调用被代理对象的方法，会先触发代理的处理方法执行，
 代理的处理方法会先完成出国办签证，然后通知真正对象的功能的方法执行，最后做注销行程的操作！！


 小结：
 动态的代理的核心：做一个代理类，把业务对象的交个代理类，返回被代理对象。
 以后调用被代理对象的功能，会先触发代理类执行。

 可以把一个功能前后的逻辑交给代理类解决！！
 */
public class TestMain {
    public static void main(String[] args) {
        // 把业务对象交给代理类返回一个被代理对象。
        UserService userService = UserProxy.getProxyService(new UserServiceImpl());
        // 对象调用方法
        userService.goAbroad();
        userService.goHome();
    }
}
