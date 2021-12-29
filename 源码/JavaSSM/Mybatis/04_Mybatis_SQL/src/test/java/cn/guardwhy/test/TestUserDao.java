package cn.guardwhy.test;

import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.User;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestUserDao {
    @Test
    // 过用户名和性别查询多个用户，查询条件是"大"和"男"
    public void testFindUserByNameAndSex(){
            // 1.通过工具类得到会话对象
            SqlSession sqlSession = MybatisUtils.getSession();
            // 2.会话对象的得到mapper接口代理对象
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // 3.创建对象
            User user = new User();
            user.setUsername("大");
            user.setSex("男");
            // 4.将元素添加到集合中
            List<User> list = mapper.findUserByNameAndSex(user);
            list.forEach(System.out::println);
            sqlSession.close();
    }

    // 更新操作
    @Test
    public void testUpdateUser(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.创建对象
        User user = new User(6,"张佳丽",Date.valueOf("1989-11-6"),"女","江州");
        // 更新行数
        int row = mapper.updateUser(user);
        System.out.println("更新了" + row + "行");
    }

    // 3. 添加批量元素
    @Test
    public void testAddUsers(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.创建集合对象
        List<User> users = new ArrayList<>();
        users.add(new User(7,"王大辉", Date.valueOf("1988-01-30"),"男","岭西"));
        users.add(new User(8,"侯国龙", Date.valueOf("1975-05-08"),"男","江州"));
        users.add(new User(9,"杨红英", Date.valueOf("1993-11-01"),"女","江州"));
        int row = mapper.addUsers(users);
        System.out.println("添加了" + row + "行");
    }

    // 删除多个用户
    @Test
    public void testDeleteUsers(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.定义数组
        int[] arrays = {14,15,16};
        int row = mapper.deleteUsers(arrays);
        System.out.println("删除了" + row + "行");
    }

    // 根据条件查询用户
    @Test
    public void testFindUserByCondition(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.创建对象
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "候");
        map.put("minDate","1980-1-1");
        map.put("maxDate","1993-12-1");
        List<User> userList = mapper.findUserByCondition(map);
        // 遍历集合
        userList.forEach(System.out::println);
    }

    // 根据条件查询用户的个数
    @Test
    public void testFindUserCount(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.创建对象
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "候");
        map.put("minDate","1980-1-1");
        map.put("maxDate","1993-12-1");
        int count = mapper.findUserCount(map);
        // 输出个数
        System.out.println("共有用户" + count + "个");
    }
}
