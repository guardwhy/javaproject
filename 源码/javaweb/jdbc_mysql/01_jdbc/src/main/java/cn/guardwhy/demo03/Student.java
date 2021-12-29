package cn.guardwhy.demo03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
学生实体类
*/
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private boolean sex;
    private Date birthday;
}
