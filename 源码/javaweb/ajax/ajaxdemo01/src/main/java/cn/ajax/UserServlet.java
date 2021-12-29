package cn.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求和响应乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        // 获取请求参数
        String username = req.getParameter("username");

        // 判断姓名是否已经注册
        if("curry".equals(username)){
            resp.getWriter().write("<font color = 'red'>用户名已注册</font>");
        }else {
            resp.getWriter().write("<font color = 'green'>用户名可用</font>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求和响应乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        // 获取请求参数
        String username = req.getParameter("username");

        // 判断姓名是否已经注册
        if("curry".equals(username)){
            resp.getWriter().write("<font color = 'red'>用户名已注册</font>");
        }else {
            resp.getWriter().write("<font color = 'green'>用户名可用</font>");
        }
    }
}
