package cn.Utils;

import java.sql.*;

/**
 * 数据库工具类
 */
public class JdbcUtils {
    // 1.URL
    private static String URL = "jdbc:mysql://localhost:3306/db2";
    // 2.用户名
    private static String USER_NAME = "root";
    // 3.密码
    private static String PASSWORD = "root";

    /**
     * 4.得到连接对象
     */
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL , USER_NAME, PASSWORD);
    }

    /**
     * 5.释放资源，关闭连接对象
     */
    public static void close(Connection connection, Statement statement){
        // 5.1先判断语句对象是否为空
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // 5.2再判断连接对象是否为空
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 6.释放资源，关闭连接等对象
     */
    public static void close(Connection connection, Statement statement, ResultSet rs){
        // 6.1判断结果集是否为空
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(connection, statement);
    }
}
