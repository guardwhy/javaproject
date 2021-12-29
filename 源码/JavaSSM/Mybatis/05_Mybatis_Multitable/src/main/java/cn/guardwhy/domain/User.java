package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

/**
 * 用户类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    private UserInfo userInfo; // 对应的用户扩展信息
    // private List<OrderForm> orders; // 对应所有的订单信息
    // private List<Role> roles; // 对应多个角色
}
