package cn.guardwhy.controller;

import cn.guardwhy.mapper.UserMapper;
import cn.guardwhy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    // 1.查询所有用户
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> list_user = userMapper.queryUserList();
        for (User user : list_user) {
            System.out.println(user);
        }
        return list_user;
    }
    // 2.查询根据id查询一个用户
    @GetMapping("/queryUserById/{id}")
    public User queryUserById(@PathVariable("id") Integer id){
        return userMapper.queryUserById(id);
    }

    // 3.添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(4, "guardwhy", "123"));
        return "ok";
    }

    // 4.修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(3, "Papul", "6667"));
        return "ok_updateUser";
    }

    // 5.删除一个用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(6);
        return "ok_deleteUser";
    }
}
