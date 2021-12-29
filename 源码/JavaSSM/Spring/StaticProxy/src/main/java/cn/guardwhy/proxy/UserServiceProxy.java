package cn.guardwhy.proxy;

import cn.guardwhy.domain.UserService;
import cn.guardwhy.domain.UserServiceImpl;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        message("添加方法");
        userService.add();
    }

    @Override
    public void delete() {
        message("删除方法");
        userService.delete();
    }

    @Override
    public void update() {
        message("更新方法");
        userService.update();
    }

    @Override
    public void query() {
        message("查询方法");
        userService.query();
    }

    public void message(String msg){
        System.out.println("执行了" + msg + "方法！！");
    }
}
