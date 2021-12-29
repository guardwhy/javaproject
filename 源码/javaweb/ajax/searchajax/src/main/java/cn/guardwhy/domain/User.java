package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
   用户的实体类
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    private Integer id;     // 主键id
    private String name;    // 姓名
    private Integer age;    // 年龄
    private Integer search_count;   //搜索数量
}
