package cn.guardwhy.service.impl;

import cn.guardwhy.mapper.UserMapper;
import cn.guardwhy.pojo.User;
import cn.guardwhy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    // 注入持久层
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUserByName(String name) {

        return userMapper.queryUserByName(name);
    }
}
