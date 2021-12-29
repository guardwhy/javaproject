package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户拓展信息类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Integer id; // 主键
    private Double height; // 身高
    private Double weight; // 体重
    private Boolean married; // 是否结婚

    // private User user; // 用户的基本信息
}
