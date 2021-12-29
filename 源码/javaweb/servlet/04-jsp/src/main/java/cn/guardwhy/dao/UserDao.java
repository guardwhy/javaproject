package cn.guardwhy.dao;

import cn.guardwhy.pojo.User;

public interface UserDao {
    // 用户登录功能
    User userLogin(User user);
}
