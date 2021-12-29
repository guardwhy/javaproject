package cn.guardwhy.servlet03;
/*
Request 相关方法
*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/parameter")
public class RequestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.设置编码
        request.setCharacterEncoding("utf-8");
        // 1.获取指定参数名称对应的参数值
        String name = request.getParameter("name");
        System.out.println("用户名:" + name);

        String[] hobbies = request.getParameterValues("hobby");
        System.out.print("爱好:");

        for(String hb : hobbies){
            System.out.print(hb + " ");
        }
        System.out.println();

        System.out.println("++++++++++++++++");

        // 2.获取所有参数的名称
        Enumeration<String> parameterNames = request.getParameterNames();
        System.out.print("获取到的所有参数:");
        while (parameterNames.hasMoreElements()){
            System.out.print(parameterNames.nextElement() + " ");
        }
        System.out.println();

        System.out.println("============");

        // 3.获取请求参数名和对应值
        Map<String, String[]> maps = request.getParameterMap();
        // 遍历集合
        Set<Map.Entry<String, String[]>> entries = maps.entrySet();
        for (Map.Entry<String, String[]> entry : entries){
            System.out.print(entry.getKey() + ":");
            for(String value : entry.getValue()){
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        // 4.获取客户端请求信息
        System.out.println("请求的IP地址：" + request.getRemoteAddr());
        System.out.println("请求的端口号：" + request.getRemotePort());
        System.out.println("请求资源的路径：" + request.getRequestURI());
        System.out.println("请求资源的完整路径为：" + request.getRequestURL());
        System.out.println("请求方式：" + request.getMethod());
        System.out.println("请求附带参数：" + request.getQueryString());
        System.out.println("请求Servlet路径：" + request.getServletPath());

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");


        // 向浏览器发出响应数据
        // 1.设置服务器和浏览器的编码方式
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 2.向浏览器中打印
        out.write("hello, ResponseServlet");
        System.out.println("服务器发送数据成功");
        // 3.关闭资源
        out.close();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
