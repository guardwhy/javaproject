package cn.guardwhy;

import cn.guardwhy.pojo.User;
import cn.guardwhy.service.UserService;
import cn.guardwhy.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08ShiorApplicationTests {
    // 注入业务层
    @Autowired
    UserServiceImpl userService;
    @Test
    void contextLoads() {
        User user = userService.queryUserByName("curry");
        System.out.println(user);
    }

}
