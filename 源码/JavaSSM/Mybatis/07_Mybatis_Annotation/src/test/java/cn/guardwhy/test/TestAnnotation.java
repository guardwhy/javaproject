package cn.guardwhy.test;

import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.User;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

public class TestAnnotation {
    private static SqlSessionFactory factory;
    private SqlSession session;
    private UserMapper userMapper;

    // 创建会话对象,自动提交事务
    @Before
    public void begin(){
        session = MybatisUtils.getSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    // 1.通过id查询一个用户
    @Test
    public void testFindUserById01(){
        User user = userMapper.findUserById01(1);
        System.out.println(user);
    }

    // 2.查询所有的用户
    @Test
    public void findAllUsers(){
        List<User> users = userMapper.findAllUsers();
        users.forEach(System.out::println);
    }

    // 更新操作
    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setUsername("张小欣");
        user.setAddress("广州");
        user.setId(12);
        int row = userMapper.updateUser(user);
        System.out.println("更新了" + row + "行");
    }

    // 删除操作
    @Test
    public void deleteUser(){
        int row = userMapper.deleteUser(9);
        System.out.println("删除了:" + row + "行记录");
    }


    // 添加操作
    @Test
    public void testAddUser(){
        User user = new User(null, "王永强", Date.valueOf("1990-2-10"), "男", "秦阳");
        int row = userMapper.addUser(user);
        System.out.println("添加了" + row + "条记录");
        System.out.println("生成的主键:" + user.getId());
    }

    // 关闭会话
    @After
    public void end(){
        session.close();
    }
}
