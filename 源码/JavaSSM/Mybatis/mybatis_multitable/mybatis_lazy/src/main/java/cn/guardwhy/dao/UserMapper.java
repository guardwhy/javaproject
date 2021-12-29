package cn.guardwhy.dao;

import cn.guardwhy.domain.User;

import java.util.List;

public interface UserMapper {
    // 1.根据ID查询用户
    User findById(Integer id);
    // 2.查询所有的用户，同时还要查询出每个用户所关联的订单信息
    List<User> findAllWithOrders();
    // 3.查询所有的用户，同时还要查询出每个用户所关联的角色信息
    List<User> findAllWithRole();
}
