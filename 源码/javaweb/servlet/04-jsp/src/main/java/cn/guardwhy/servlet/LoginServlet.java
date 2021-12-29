package cn.guardwhy.servlet;

import cn.guardwhy.pojo.User;
import cn.guardwhy.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取请求中的用户名和密码
        String userName = request.getParameter("userName");
        System.out.println("获取到的用户名:" + userName);
        String password = request.getParameter("password");
        System.out.println("获取到的密码:" + password);

        // 2.创建UserService类型的对象去实现数据的校验功能
        UserService userService = new UserService();
        User user = userService.userLoginService(new User(userName, password));
        // 3.条件判断
        if(null == user){
            System.out.println("登录失败,用户名或者密码错误！");
            request.setAttribute("error", "登录失败,用户名或者密码错误！");
            // 4.实现跳转
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request,response);
        }else {
            System.out.println("登入成功,欢迎成功..");
            // 5.将用户信息放入session对象
            request.getSession().setAttribute("user", user);
            // 6.实现用户的跳转
            response.sendRedirect("main.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
