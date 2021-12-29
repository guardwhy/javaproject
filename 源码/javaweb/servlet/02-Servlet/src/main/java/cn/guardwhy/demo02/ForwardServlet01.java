package cn.guardwhy.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forwardServlet01")
public class ForwardServlet01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接收到了浏览器的请求");
        // 1.向请求域中添加键值对
        request.setAttribute("username", "kobe");
        // 2.转发，也就是让Web组件将任务转交给另外一个Web组件
        request.getRequestDispatcher("/forwardServlet02").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
