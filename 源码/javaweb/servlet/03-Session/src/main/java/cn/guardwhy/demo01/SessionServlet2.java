package cn.guardwhy.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionServlet2", urlPatterns = "/session2")
public class SessionServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取Session对象,得到会话域
        HttpSession session = request.getSession();
        // 2.会话域中存入属性名和属性值
        session.setAttribute("username", "guardwhy");
        // 3.从会话域中取出对应的属性值
        System.out.println("属性值:" + session.getAttribute("username"));
        // 4.删除指定的属性名
        session.removeAttribute("username");
        // 5.从会话域中取出对应的属性值
        System.out.println("属性值:" + session.getAttribute("username"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
