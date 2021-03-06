package cn.guardwhy.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
// Dept实体类
public class Dept implements Serializable {
    // 主键
    private Long deptno;
    // 部门名称
    private String dname;
    // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存到多个不同的数据库
    private String db_source;
}