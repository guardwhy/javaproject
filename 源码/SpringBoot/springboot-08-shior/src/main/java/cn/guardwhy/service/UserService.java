package cn.guardwhy.service;

import cn.guardwhy.pojo.User;

// 业务层
public interface UserService {
    User queryUserByName(String name);
}
