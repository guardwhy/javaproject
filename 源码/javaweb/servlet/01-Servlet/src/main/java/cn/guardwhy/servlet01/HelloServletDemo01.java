package cn.guardwhy.servlet01;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServletDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.设置响应内容的类型和编码
        response.setContentType("text/html;charset=utf-8");
        // 2.得到打印流
        PrintWriter out = response.getWriter();
        // 3.向浏览器输出文本
        out.print("<h3>Hello, Servlet!!!<h3>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doPost(req, resp);
    }

}
