package cn.guardwhy.dao;

import cn.guardwhy.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户dao的接口
 */
public interface UserMapper {

    // 3.批量添加用户
    int addUsers(List<User> users);
    // 7.分页查询
    List<User> getUserByLimit(Map<String, Integer> map);

    // RowBounds分页(Java代码实现)
    List<User> getUserByRowBounds();
}
