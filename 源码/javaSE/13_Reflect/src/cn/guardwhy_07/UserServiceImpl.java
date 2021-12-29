package cn.guardwhy_07;
/**
 * 动态代理引入接口实现类
 */
public class UserServiceImpl implements UserService{
    @Override
    public void goAbroad() {
        System.out.println("开始愉快的出国玩耍");
    }

    @Override
    public void goHome() {
        System.out.println("开始完满的回国吹水");
    }
}
