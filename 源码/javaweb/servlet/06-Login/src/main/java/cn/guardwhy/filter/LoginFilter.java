package cn.guardwhy.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/*
拦截器
*/
public class LoginFilter implements Filter {
    @Override
    // web服务器启动,过滤器开始初始化，随时等待过滤对象出现。
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化操作正在火热进行中...");
        System.out.println("获取到的过滤器名称为：" + filterConfig.getFilterName());
        String userName = filterConfig.getInitParameter("userName");
        System.out.println("获取到指定初始化参数的数值为：" + userName);  // admin
        Enumeration<String> initParameterNames = filterConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            // userName password
            System.out.println("获取到的初始化参数名为：" + initParameterNames.nextElement());
        }
        ServletContext servletContext = filterConfig.getServletContext();
        System.out.println("获取到的上下文对象是：" + servletContext);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        // 0.设置编码
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        // 1.获取session对象
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();
        // 2.得到用户名
        Object userName = session.getAttribute("userName");
        // 3.获取Servlet请求路径
        String servletPath = httpServletRequest.getServletPath();
        // 4.假设没有登录,则返回登录页面
        if(null == userName && !servletPath.contains("login") ){
            // 转发
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
            // 5.登录则放行
            filterChain.doFilter(request, response);
        }
    }

    @Override
    // web服务器关闭的时候,过滤器销毁
    public void destroy() {
        System.out.println("过滤器销毁。。");
    }
}
