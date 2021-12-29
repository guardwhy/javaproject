package cn.guardwhy.service;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.factory.UserDaoFactory;
import cn.guardwhy.pojo.User;

public class UserService {
    // 添加UserDao
    private UserDao userDao;
    public UserService(){
        this.userDao = UserDaoFactory.getUserDao();
    }

    /**
     * 根据参数指定的User对象来调用DAO层实现登录功能
     * @param user
     * @return
     */
    public User userLoginService(User user){
        return userDao.userLogin(user);
    }
}
