package cn.guardwhy.Test;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringMybatisTest {
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        List<User> user = userDao.findAllUsers();
        System.out.print(user);
    }
}
