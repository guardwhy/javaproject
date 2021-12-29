package cn.guardwhy.test;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.dao.impl.UserDaoImpl;
import cn.guardwhy.pojo.User;
import cn.guardwhy.service.UserService;
import org.junit.Test;

public class UserServiceTest {
    @Test
    public void demo02(){
        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserService();
        User root = userService.userLoginService(new User("abc", "123"));
        System.out.println("找到数据" + root);
    }
}
