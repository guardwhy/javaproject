package cn.guardwhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

// Person类
@Component
@ConfigurationProperties(prefix = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
// 加载指定的配置文件
// @PropertySource(value = "classpath:Person.properties")
public class Person {
    private String name;
    private Integer age;
    private Date birthday;
    private Map<String, Object> maps;
    private List<Object> lists;
    // 导入学生类
    private Student student;
}
