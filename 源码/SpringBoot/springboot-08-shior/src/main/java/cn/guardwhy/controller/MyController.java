package cn.guardwhy.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping({"/","/index"})
    public String toIndex(Model model){
        model.addAttribute("msg","hello,Shiro!!!");
        return "index";
    }

    @RequestMapping("/user/add")
    public String toAdd(){
        return "user/add";
    }

    @RequestMapping("/user/update")
    public String toUpdate(){
        return "user/update";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    // 登录操作
    @RequestMapping("/login")
    public String login(String username, String password, Model model){
        // 获取当前的用户
        Subject subject = SecurityUtils.getSubject();
        // 封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
          subject.login(token); // 执行登录方法，如果没有异常就说明ok了
          return "index";
        } catch (UnknownAccountException e) { //用户名不存在
          model.addAttribute("msg","用户名不存在");
          return "login";
        } catch (IncorrectCredentialsException e) { //密码错误
          model.addAttribute("msg","密码错误");
          return "login";
        }
    }

    // 未授权的请求页面
    @RequestMapping("/noAuth")
    @ResponseBody
    public String unauthorized(){
        return "未经授权不能访问此页面";
    }
}
