package cn.guardwhy_02;

import cn.Utils.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 实现用户的登陆
 */
public class LoginDemo02 {
    public static void main(String[] args) throws SQLException {
        // 1.用于用户的输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scanner.nextLine();

        // 2.密码输入
        System.out.println("请输入密码:");
        String password = scanner.nextLine();
        // 3.执行SQL语句
        String sql = "select * from user where name=? and password=?";

        // 4.通过工具类得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 5.通过连接对象创建预编译的语句对象
        PreparedStatement ps = connection.prepareStatement(sql);
        // 6.替换占位符
        ps.setString(1,name);
        ps.setString(2, password);

        // 7.执行SQL语句,使用字符串拼接的方式创建SQL语句
        ResultSet rs = ps.executeQuery();
        // 8.查询得到结果集,如果结果集中有记录表示登录成功,否则登录失败
        if(rs.next()){
            System.out.println("欢迎你" + name + ", 登陆成功!!");
        }else {
            System.out.println("登陆失败..");
        }

        // 释放工具类资源
        JdbcUtils.close(connection, ps, rs);
    }
}
