package cn.guardwhy.test;

import cn.guardwhy.dao.OrderMapper;
import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.Orders;
import cn.guardwhy.domain.User;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    // 1.一对一查询
    @Test
    public void testOrderWithUser(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        // 3.调用方法
        List<Orders> list = mapper.findAllWithUser();
        for (Orders orders : list) {
            System.out.println(orders);
        }
        sqlSession.close();
    }

    // 2.查询一个用户，与此同时查询出该用户具有的订单
    @Test
    public void testUserWithOrders(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.调用方法
        List<User> userList = mapper.findAllWithOrders();
        for (User user : userList) {
            System.out.println(user);
            //System.out.println(user.getOrdersList());
        }

    }

    // 3.多对多查询
    @Test
    public void testUserWithRole(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.调用方法
        List<User> list = mapper.findAllWithRole();
        // 4.遍历操作
        for (User user : list) {
            System.out.println(user);
        }
    }
}
