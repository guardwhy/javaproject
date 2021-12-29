package cn.guardwhy.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接url,用户名，密码
        String url = "jdbc:mysql://localhost:3306/db_jdbc";
        Connection con = DriverManager.getConnection(url, "root", "root");
        // 3.获取Statement对象
        Statement statement = con.createStatement();
        // 4.执行创建表操作
        String sql = "create table jdbc02(id int, name varchar(20),age int)";
        // 5.增删改操作，增加一张表
        int i = statement.executeUpdate(sql);
        // 6.输出结果
        System.out.println(i);
        // 7.关闭流操作
        statement.close();
        con.close();
    }
}
