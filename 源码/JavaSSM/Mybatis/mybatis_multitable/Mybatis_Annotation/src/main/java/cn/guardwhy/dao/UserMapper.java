package cn.guardwhy.dao;

import cn.guardwhy.domain.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where id = #{id}")
    @Results({
        @Result(column = "id", property = "id", id = true), // 映射主键
        @Result(column = "user_name", property = "username"),
        @Result(column = "birthday", property = "birthday"),
        @Result(column = "sex", property = "sex"),
        @Result(column = "address", property = "address")
    })
    // 1.通过id查询用户
    User findById(Integer id);

    // 2.查询所有用户，及关联的订单信息
    @Select("select * from user")
    @Results({
        @Result(column = "id", property = "id", id = true), // 映射主键
        @Result(column = "user_name", property = "username"),
        @Result(column = "birthday", property = "birthday"),
        @Result(column = "sex", property = "sex"),
        @Result(column = "address", property = "address"),
        @Result(property = "ordersList", javaType = List.class, column = "id",
        many = @Many(select = "cn.guardwhy.dao.OrderMapper.findByOid"))
    })
    List<User> findAllWithOrders();


    // 3.查询所有用户及关联的角色信息
    @Select("select * from user")
    @Results({
            @Result(column = "id", property = "id", id = true), // 映射主键
            @Result(column = "user_name", property = "username"),
            @Result(column = "birthday", property = "birthday"),
            @Result(column = "sex", property = "sex"),
            @Result(column = "address", property = "address"),
            @Result(property = "roleList", javaType = List.class, column = "id",
                    many = @Many(select = "cn.guardwhy.dao.RoleMapper.findByOid"))
    })
    List<User> findAllWithRole();
}
