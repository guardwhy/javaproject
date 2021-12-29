package cn.guardwhy.servlet;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取请求对象保存用户和密码
        String userName = request.getParameter("userName");
        System.out.println("获取到的用户名:" + userName);
        String password = request.getParameter("password");
        System.out.println("获取到的用户密码:" + password);

        // 2.将用户名和密码打包成用户对象交给DAO层进行处理
        User user = new User(userName, password);
        UserDao userDao = new UserDao();
        int res = userDao.createUser(user);

        // 3.将处理的结果
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        // 条件判断
        if(1 == res){
            System.out.println("注册成功");
            out.write("<h3>注册成功</h3>");
        }else {
            out.write("<h3>注册失败</h3>");
        }

        // 关闭打印流
        out.close();
    }
}
