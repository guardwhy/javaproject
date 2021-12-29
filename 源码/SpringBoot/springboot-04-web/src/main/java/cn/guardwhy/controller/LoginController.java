package cn.guardwhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session
                        ){
        // 具体业务
        if(!StringUtils.isEmpty(username) && "123666".equals(password)){
            // 登录成功！将用户信息放入session
            session.setAttribute("loginUser", username);
            // 防止表单重复提交，重定向
            return "redirect:/main.html";
        }else{
            // 告诉用户，登录失败了
            model.addAttribute("msg","用户名或者密码错误!");
            return "index";
        }
    }
}
