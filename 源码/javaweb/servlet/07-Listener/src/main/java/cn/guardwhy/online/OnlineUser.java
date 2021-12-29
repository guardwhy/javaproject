package cn.guardwhy.online;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineUser implements HttpSessionListener, ServletContextListener {
    // 1.声明全局变量
    private ServletContext servletContext = null;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContext = servletContextEvent.getServletContext();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        servletContext = null;
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("新用户上线");
        Object count = servletContext.getAttribute("count");
        // 2.若当前用户为第一,将全局对象中的属性设置为1
        if (null == count){
            servletContext.setAttribute("count", 1);
        }else {
            // 当前用户不是第一个用户，则将全局对象中原有的数据取出来加1后再设置进去
            Integer integer = (Integer) count;
            integer++;
            servletContext.setAttribute("count", integer);
        }
        System.out.println("当前在线用户数量:" + servletContext.getAttribute("count"));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("用户已下线...");
    }
}
