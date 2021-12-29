package cn.guardwhy.dao;

import cn.guardwhy.domain.Orders;
import cn.guardwhy.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface OrderMapper {

    // 1.查询所有订单,同时查询订单所属的用户信息
    @Select("select * from orders")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "ordertime", property = "ordertime"),
            @Result(column = "total", property = "total"),
            @Result(column = "oid", property = "oid"),
            @Result(property = "user", javaType = User.class, column = "oid",
                    one = @One(select = "cn.guardwhy.dao.UserMapper.findById", fetchType = FetchType.EAGER))
    })
    List<Orders> findAllWithUser();


    // 2.根据传递过来的用户id，查询该用户所具有的订单信息
    @Select("select * from orders where oid = #{id}")
    List<Orders> findByOid(Integer oid);
}
