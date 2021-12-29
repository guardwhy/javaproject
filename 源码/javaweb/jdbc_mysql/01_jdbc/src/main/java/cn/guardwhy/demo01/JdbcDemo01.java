package cn.guardwhy.demo01;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接url,用户名，密码
        String url = "jdbc:mysql://localhost:3306/db_jdbc";
        Connection con = DriverManager.getConnection(url, "root", "root");
        // 3.获取连接对象
        System.out.println(con);
    }
}
