package cn.guardwhy.test;

import cn.guardwhy.dao.OrderMapper;
import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.Orders;
import cn.guardwhy.domain.User;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

// 测试代码
public class MybatisTest {
    @Test
    public void testOrderWithUser(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        // 3.调用方法
        List<Orders> orders = mapper.findAllUser();
        // 4.遍历操作
        for (Orders order : orders) {
            System.out.println(order);
        }
    }

    @Test
    public void testUserWithOrder(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.调用方法
        List<User> userList = mapper.findAllWithOrder();
        // 4.遍历操作
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testUserWithRole(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findAllWithRole();
        userList.forEach(System.out::println);
    }


    @Test
    public void testOrderWithUser02(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        // 3.调用方法
        List<Orders> orders = mapper.findAllWithUser();
        // 4.遍历操作
        for (Orders order : orders) {
            System.out.println(order);
        }
    }

    @Test
    public void testUserWithOrder02(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.调用方法
        List<User> userList = mapper.findAllWithOrders();
        // 4.遍历操作
        for (User user : userList) {
            System.out.println(user);
        }
    }

    // 1.一级缓存
    @Test
    public void testOneCache(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 根据id查询用户信息,第一次查询，查的是数据库
        User user1 = mapper.findById(1);
        System.out.println(user1);
        // 第二次查询,查询的是一级缓存
        User user2 = mapper.findById(1);
        System.out.println(user2);
        // 关闭会话对象
        sqlSession.close();
    }
}
