package cn.guardwhy.demo01;

import cn.guardwhy.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo05 {
    public static void main(String[] args) {
        // 1.创建数据表
        String sql = "create table student ( id int primary key auto_increment, " +
                "name varchar(20) not null," +
                "sex boolean, " +
                "birthday date)";
        try {
            // 2.创建数据库连接
            Connection connection = JDBCUtils.getConnection();
            // 3.通过连接对象创建语句对象
            Statement statement = connection.createStatement();
            // 4.通过语句对象执行DDL
            statement.execute(sql);
            System.out.println("创建表成功...");
        } catch (SQLException e) {
            // 关闭语句和连接对象
            e.printStackTrace();
            System.out.println("创建数据表失败...");
        }
    }
}
