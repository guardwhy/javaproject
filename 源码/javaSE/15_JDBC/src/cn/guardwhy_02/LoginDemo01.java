package cn.guardwhy_02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import cn.Utils.JdbcUtils;

/**
 * 实现用户的登陆
 */
public class LoginDemo01 {
    public static void main(String[] args) throws SQLException {
        // 1.用于用户的输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scanner.nextLine();

        // 2.密码输入
        System.out.println("请输入密码:");
        String password = scanner.nextLine();

        // 3.通过工具类得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 4.通过连接对象获得语句对象
        Statement statement = connection.createStatement();
        // 5.执行SQL语句
        String sql = "select * from user where name='" + name + "' and password='" + password + "'";
        System.out.println("服务器运行的SQL语句:" + sql);
        // 6.通过语句对象获得结果集
        ResultSet rs = statement.executeQuery(sql);
        // 7.查询结果集,如果结果集中有记录，则登陆成功,否则登陆失败
        if (rs.next()){
            System.out.println("欢迎你" + name + ", 登陆成功。。");
        }else {
            System.out.println("登陆失败...");
        }

        // 释放工具类资源
        JdbcUtils.close(connection, statement, rs);
    }
}
