package cn.guardwhy.dao;

import cn.guardwhy.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 持久化接口:UserMapper
 */
public interface UserMapper {
    // 1.通过id查询一个用户
    @Select("select * from user where id = #{id}")
    @Results({
            @Result(column = "id", property = "id", id = true), // 映射注解
            @Result(column = "user_name", property = "username") // 映射普通列
    })
    // 方法存在多个参数的情况下，所有参数面前必须加上@Param()
    User findUserById01(@Param("id") int id);

    // 2.查询所有的用户
    @Select("select * from user")
    @Results({
            @Result(column = "id", property = "id", id = true), // 映射注解
            @Result(column = "user_name", property = "username") // 映射普通列
    })
    List<User> findAllUsers();


    // 根据用户id修改用户
    @Update("update user set user_name=#{username}, address=#{address} where id=#{id}")
    int updateUser(User user);

    // 根据用户id删除用户
    @Delete("delete from user where id=#{id}")
    // 方法存在多个参数的情况下，所有参数面前必须加上@Param()
    int deleteUser(@Param("id") int id);

    // 插入一条记录
    @Insert("insert into user values (null, #{username},#{birthday},#{sex},#{address})")
    /**
     statement:获取主键的SQL语句
     keyProperty: 实体类中主键的属性名
     keyColumn:表中主键列的名字
     resultType:主键数据类型
     before: false 之后 true之前
     */
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", keyColumn = "id", resultType = Integer.class, before = false)
    int addUser(User user);
}
