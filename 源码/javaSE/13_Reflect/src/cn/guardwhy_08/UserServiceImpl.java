package cn.guardwhy_08;
/**
 * bookService 实现类
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        try {
            Thread.sleep(500);
            System.out.println("添加用户成功...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean delete() {
        try {
            Thread.sleep(500);
            System.out.println("删除用户失败...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update() {
        try {
            Thread.sleep(1500);
            System.out.println("修改用户成功...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void query() {
        try {
            Thread.sleep(3500);
            System.out.println("查询用户成功...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
