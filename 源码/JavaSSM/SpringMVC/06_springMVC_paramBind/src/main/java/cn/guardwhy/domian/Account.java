package cn.guardwhy.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 账户类
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Account implements Serializable {
    private String username; //姓名
    private String password; // 密码
    private Double money;   // 金额

    private List<User> list; // 用户list集合
    private Map<String, User> map; // 用户Map集合
}
