package cn.guardwhy.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionServlet1", urlPatterns = "/session1")
public class SessionServlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取Session对象,得到会话域
        HttpSession session = request.getSession();
        // 2.判断Session对象是否为新建的对象
        System.out.println(session.isNew() ? "新创建的Session对象": "已有的Session对象");
        // 3.获取编号并且打印
        String id = session.getId();
        System.out.println("获取到的Session编号:" + id);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
