package cn.guardwhy.demo01;

import cn.guardwhy.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * 查询学生表中的所有记录,并且输出
 */
public class JdbcDemo07 {
    public static void main(String[] args) throws SQLException {
        // 1.创建连接
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.通过语句对象执行sql语句，返回结果集
        ResultSet rs = statement.executeQuery("select * from student");
        // 4.遍历结果集
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            boolean sex = rs.getBoolean(3);
            Date birthday = rs.getDate(4);
            // 输出结果
            System.out.println("编号:" + id + ",姓名:" + name + ", 性别:" + (sex? "男":"女") + ", 生日:" + birthday);
        }
        // 5.释放资源
        JDBCUtils.close(connection, statement, rs);
    }
}
