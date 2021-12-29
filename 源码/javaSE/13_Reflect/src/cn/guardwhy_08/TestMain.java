package cn.guardwhy_08;
/**
 优点：
     动态代理非常的灵活，可以为任意的接口实现类对象做代理：只能为接口的实现类对象做代理！！
     动态代理可以为被代理对象的所有接口的所有方法做代理，动态代理可以在不改变方法源码的情况下，实现对方法功能的增强。
     动态代理类不仅简化了编程工作，而且提高了软件系统的可扩展性，因为Java反射机制可以生成任意类型的动态代理类。
     动态代理同时也提高了开发效率。
 缺点：
    只能针对接口的实现类做代理对象，普通类是不能做代理对象的。
 */
public class TestMain {
    public static void main(String[] args) {
        // 把业务对象交给代理类返回一个被代理对象。
        UserService userService = UserProxy.getProxyService(new UserServiceImpl());
        // 对象调用方法
        userService.add();
        userService.delete();
        System.out.println(userService.update());
        userService.query();
    }
}
