package cn.guardwhy.dao;

import cn.guardwhy.domain.Orders;

import java.util.List;

public interface OrderMapper {
    // 一对一关联查询:查询所有的订单,与此同时还要查出每个订单所属的用户信息
     List<Orders> findAllUser();
     // 2.一对一嵌套查询:查询所有的订单,与此同时还要查出每个订单所属的用户信息
    List<Orders> findAllWithUser();

    // 3. 根据oid查询对应订单
    List<Orders> findByOid(Integer oid);
}
