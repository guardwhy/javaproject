package cn.guardwhy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
控制器:Servlet
*/
@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取请求中的用户名和密码
        String userName = request.getParameter("userName");
        System.out.println("获取到的用户名:" + userName);
        String password = request.getParameter("password");
        System.out.println("获取到的密码:" + password);
        // 2.用户名和密码校验
        if("Curry".equals(userName) && "1234".equals(password)){
            System.out.println("登录成功,欢迎使用");
            // 3.存储用户信息
            request.getSession().setAttribute("userName", userName);
            // 4.重定向
            response.sendRedirect("main.jsp");
        }else {
            System.out.println("用户名或者密码错误,请重新输入...");
            // 5.转发
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
