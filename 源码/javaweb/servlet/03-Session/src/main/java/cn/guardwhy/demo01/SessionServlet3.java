package cn.guardwhy.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionServlet3", urlPatterns = "/session3")
public class SessionServlet3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取Session对象,得到会话域
        HttpSession session = request.getSession();
       // 2.获取对象的默认失效时间
        int maxInactiveInterval = session.getMaxInactiveInterval();
        System.out.println("获取到失效时间:" + maxInactiveInterval);   // 1800
        // 3.修改实现时间
        session.setMaxInactiveInterval(1000);
        maxInactiveInterval = session.getMaxInactiveInterval();
        System.out.println("获取失效时间:" + maxInactiveInterval);    // 1000
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
