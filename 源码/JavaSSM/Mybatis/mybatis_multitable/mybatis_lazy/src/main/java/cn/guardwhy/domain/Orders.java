package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
*订单表
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Integer id; // 订单id
    private String ordertime; // 订单时间
    private double total; // 总额
    private Integer oid;

    // 表示当前订单属于哪个用户
    private User user;
}
