package cn.guardwhy.service;

import cn.guardwhy.domain.User;
import java.util.List;

public interface UserService {
    // 模糊查询
    List<User> selectLike(String username);
}
