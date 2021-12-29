package cn.guardwhy.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/forwardServlet02")
public class ForwardServlet02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("数据转发过来了");
        // 1.从请求域中取出用户名
        String username = (String) request.getAttribute("username");
        System.out.println("获取的用户名:" + username);
        // 2.设置编码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("从请求域中取出用户:" + username);
        out.write("<h3>转发成功...</h3>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
