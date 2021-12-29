package cn.guardwhy.controller;

import cn.guardwhy.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello Swagger!!!";
    }

    // 只要接口中，返回值存在实体类，它就会扫描到Swagger中
    @PostMapping(value = "/user")
    public User user(){
        return new User();
    }
}
