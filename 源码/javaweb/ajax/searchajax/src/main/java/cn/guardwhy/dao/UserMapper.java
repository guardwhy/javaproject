package cn.guardwhy.dao;

import cn.guardwhy.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> selectLike(String username);
}
