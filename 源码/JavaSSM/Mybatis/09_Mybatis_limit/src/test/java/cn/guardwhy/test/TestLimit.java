package cn.guardwhy.test;

import cn.guardwhy.dao.UserMapper;
import cn.guardwhy.domain.User;
import cn.guardwhy.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class TestLimit {
    /*
    *  分页测试
    */
    @Test
    public void getUserByLimit(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.会话对象的得到mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.创建Map集合
        HashMap<String, Integer> map = new HashMap<>();
        // 往集合中添加数据
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> users = mapper.getUserByLimit(map);
        users.forEach(System.out::println);
    }

    /*
    *  RowBounds类(Java实现)
    */
    @Test
    public void getUserByRowBounds(){
        // 1.通过工具类得到会话对象
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2.RowBounds类实现
        RowBounds rowBounds = new RowBounds(1, 2);
        // 3.通过Java代码层面实现分页
        List<User> users = sqlSession.selectList("cn.guardwhy.dao.UserMapper.getUserByRowBounds", null, rowBounds);

        users.forEach(System.out::println);
        // 4.关闭会话
        sqlSession.close();
    }
}
