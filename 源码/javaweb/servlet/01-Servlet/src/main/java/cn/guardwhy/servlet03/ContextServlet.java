package cn.guardwhy.servlet03;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
*   ServletContext:上下文域
*/

@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.1配置参数的获取
        ServletContext servletContext = this.getServletContext();
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        // 1.2遍历集合
        while (initParameterNames.hasMoreElements()){
            String str = initParameterNames.nextElement();
            System.out.println(str + "===>" + servletContext.getInitParameter(str));
        }

        // 2.1 设置属性和获取属性信息
        servletContext.setAttribute("key", "guardwhy");
        Object key = servletContext.getAttribute("key");
        System.out.println("属性值:" + key);   // guardwhy

        // 2.2 移除属性
        servletContext.removeAttribute("key");
        key = servletContext.getAttribute("key");
        System.out.println("属性值:" + key);   // null
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
