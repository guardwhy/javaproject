package cn.guardwhy.mapper;

import cn.guardwhy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper // 这个注解表示了这是一个mybatis的mapper类: dao
@Repository
public interface UserMapper {
    // 1.查询所有的用户
    List<User> queryUserList();
    // 2.根据id查询用户
    User queryUserById(Integer id);
    // 3.添加用户
    int addUser(User user);
    // 4.修改用户
    int updateUser(User user);

    // 5.根据id删除用户
    int deleteUser(int id);
}
