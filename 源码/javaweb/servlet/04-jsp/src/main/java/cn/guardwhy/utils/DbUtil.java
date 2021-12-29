package cn.guardwhy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
   jdbc工具类
*/
public class DbUtil {
    private static String jdbcName;   // 用于描述驱动信息
    private static String dbUrl;      // 用于描述URL信息
    private static String dbUserName; // 用户描述用户名信息
    private static String dbPassword; // 用户描述密码信息

    // 2.静态成员初始化操作
    static {
        jdbcName = "com.mysql.jdbc.Driver";
        dbUrl = "jdbc:mysql://localhost:3306/db_web";
        dbUserName = "root";
        dbPassword = "root";

        try {
            // 2.1 加载驱动
            Class.forName(jdbcName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return connection;
    }

    /**
     * 关闭连接
     * @param con
     * @param psts
     * @throws SQLException
     */
    public static void closeResource(Connection con, PreparedStatement psts) throws SQLException {
        // 条件判断
        if(con != null){
            con.close();
        }

        if(psts != null){
            psts.close();
        }
    }
}
