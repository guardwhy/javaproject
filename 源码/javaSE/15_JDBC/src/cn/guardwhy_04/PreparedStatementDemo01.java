package cn.guardwhy_04;


import cn.Utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 使用PreparedStatement实现增删改操作
 */
public class PreparedStatementDemo01 {
    @Test
    public void insert() throws SQLException{
        // 1.得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 2.通过连接对象创建预编译语句,提供占位符的SQL语句
        PreparedStatement ps = connection.prepareStatement("insert into student values(null,?,?,?)");
        // 3.替换占位符
        ps.setString(1, "丁浩");
        ps.setBoolean(2, false);
        ps.setDate(3, Date.valueOf("1991-03-22"));
        // 4.执行增删改操作
        int row = ps.executeUpdate();
        // 5.返回影响的行数
        System.out.println("添加了" + row + "行记录");
        // 6.释放资源
        JdbcUtils.close(connection, ps);
    }

    @Test
    public void update() throws SQLException{
        // 1.得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 2.通过连接对象创建预编译语句,提供占位符的SQL语句
        PreparedStatement ps = connection.prepareStatement("update student set name=?, birthday=? where id=?");
        // 3.替换占位符
        ps.setString(1, "葛向东");
        ps.setDate(2, Date.valueOf("1986-03-12"));
        ps.setInt(3, 2);
        // 4.执行增删改操作
        int row = ps.executeUpdate();
        // 5.返回影响的行数
        System.out.println("更新了" + row + "行记录");
        // 6.释放资源
        JdbcUtils.close(connection, ps);
    }

    @Test
    public void delete() throws SQLException{
        // 1.得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 2.通过连接对象创建预编译语句,提供占位符的SQL语句
        PreparedStatement ps = connection.prepareStatement("delete from student where id = ?");
        // 3.替换占位符
        ps.setInt(1, 1);
        // 4.执行增删改操作
        int row = ps.executeUpdate();
        // 5.返回影响的行数
        System.out.println("删除了" + row + "行记录");
        // 6.释放资源
        JdbcUtils.close(connection, ps);
    }
}
