package cn.guardwhy.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户类
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User implements Serializable {
    private String uname;  // 用户name
    private Integer age; // 用户gae
    private Date date; // 用户生日
}
