package cn.guardwhy.test;

import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.enty.User;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 使用db_mybatis数据库
 */
public class TestUserMapper {
    @Test
    /*
    * 查询所有用户
    */
    public void selectUser(){
        // 1.通过工具类得到会话对象
        SqlSession session = MybatisUtils.getSession();
        // 2.会话对象的得到UserMapper接口代理对象
        UserMapper userMapper = session.getMapper(UserMapper.class);
        // 3.生成了代理对象
        System.out.println(userMapper);
        // 4.执行查询操作
        List<User> users = userMapper.findAllUsers();
        // 5.遍历
        users.forEach(System.out::println);
        // 6.关闭会话
        session.close();
    }
}
