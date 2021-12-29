package cn.guardwhy.dao;

import cn.guardwhy.domain.Orders;

import java.util.List;
// 订单接口(嵌套查询)
public interface OrderMapper {
     // 1.查询所有的订单,与此同时还要查出每个订单所属的用户信息
    List<Orders> findAllWithUser1();

    // 2.根据oid查询对应订单
    List<Orders> findByUid(Integer oid);
}
