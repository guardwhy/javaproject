package cn.guardwhy.dao;

import cn.guardwhy.domain.User;

import java.util.List;

public interface UserDao {
    // 查找所有用户
    List<User> findAllUsers();
}
