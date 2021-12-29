package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*
* 用户类
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    // 代表当前用户具备的订单列表
    private List<Orders> ordersList;
    // 表示多方关系:代表了当前用户所具有的角色列表
    private List<Role> roleList;
}
