package cn.guardwhy.demo01;

import java.sql.*;

public class JdbcDemo04 {
    public static void main(String[] args)  {

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // 2.获取连接url,用户名，密码
            String url = "jdbc:mysql://localhost:3306/db_jdbc";
            con = DriverManager.getConnection(url, "root", "root");
            // 3.获取Statement对象
            statement = con.createStatement();
            String sql = "select * from jdbc_user";
            // 4.执行查询操作，返回结果集对象
             resultSet = statement.executeQuery(sql);
            // 5.使用while循环
            while (resultSet.next()){
                // 5.1 获取id
                int id = resultSet.getInt("id");
                // 5.2 获取username
                String username = resultSet.getString("username");
                // 5.3 获取birthday
                Date birthday = resultSet.getDate("birthday");

                // 输出结果
                System.out.println("编号: " + id + ", 用户名:" + username + ", 生日:" + birthday);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 6.关闭连接对象
            try {
                resultSet.close();
                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
