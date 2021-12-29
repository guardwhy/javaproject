package cn.guardwhy.dao.Impl;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public List<User> findAllUsers() {
        UserDao userDao = getSqlSession().getMapper(UserDao.class);
        return userDao.findAllUsers();
    }
}
