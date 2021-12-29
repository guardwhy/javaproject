package cn.guardwhy.utils;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCPUtils {
    //1. 定义字符串常量, 获取连接所需要的信息
    public static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/db_jdbc?characterEncoding=UTF-8";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    // 2.创建连接池对象(有dbcp提供的实现类)
    public static BasicDataSource dataSource = new BasicDataSource();
    // 3.使用静态代码块进行配置
    static {
        dataSource.setDriverClassName(DRIVERNAME);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
    }
    // 4.获取连接的方法
    public static Connection getConnection() throws SQLException {
        // 4.1 从连接池中获取连接
        Connection connection = dataSource.getConnection();
        return connection;
    }
    // 5.释放资源
    public static void close(Connection connection, Statement statement){
        // 5.1 条件判断
        if(connection != null && statement != null){
            try {
                statement.close();
                // 5.2 归还连接
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // 6.关闭连接
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        // 6.1 条件判断
        if(connection != null && statement != null && resultSet != null){
            try {
                resultSet.close();
                statement.close();
                // 6.1 归还连接
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
