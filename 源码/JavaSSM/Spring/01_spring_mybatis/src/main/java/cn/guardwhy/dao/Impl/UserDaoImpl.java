package cn.guardwhy.dao.Impl;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.domain.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    // 注入sqlSession
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> findAllUsers() {
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return mapper.findAllUsers();
    }
}
