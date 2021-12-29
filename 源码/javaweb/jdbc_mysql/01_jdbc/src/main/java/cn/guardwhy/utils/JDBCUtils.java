package cn.guardwhy.utils;

import java.sql.*;

/*
* jdbc工具类
*/
public class JDBCUtils {
    //1. 定义字符串常量, 获取连接所需要的信息
    public static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/db_jdbc?characterEncoding=UTF-8";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    // 2.注册加载驱动
    static {
        // 2.1 注册驱动
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 3.获取连接对象
    public static Connection getConnection(){
        try {
            // 3.1获取连接对象
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 3.2 返回连接对象
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    // 4.关闭连接对象
    public static void close(Connection connection, Statement  statement){
        // 4.1 判断语句对象是否为空
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // 4.2 判断语句连接对象是否为空
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    // 5.关闭连接等对象
    public static void close(Connection connection, Statement statement,
                             ResultSet rs) {
        // 5.1判断结果集是否为空
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(connection, statement);
    }
}
