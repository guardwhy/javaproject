package cn.guardwhy_01;
/**
 * JDBC:执行DML操作
 */
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDemo03 {

    @Test
    public void insert()throws SQLException {
        // 1.创建数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");
        // 2.通过连接对象获得语句对象
        Statement statement = connection.createStatement();
        // 3.执行增删操作
        int row = statement.executeUpdate("insert into student (name,sex,birthday) values ('侯大利',1,'1999-2-10')," +
                "('田甜',1,'1999-5-10'),('杨红',1,'1999-2-10'),('张晓',1,'1999-2-10')");
        // 4.输出影响的行数
        System.out.println("添加了" + row + "行记录");
        // 释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void update() throws SQLException{
        // 1.创建数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.执行修改操作
        int row = statement.executeUpdate("update student set name='宁玲', sex=0, birthday='1996-04-12'where id = 3");
        // 4.输出影响的行数
        System.out.println("更新了" + row + "行的数据");
        // 5.释放资源
        statement.close();
        connection.close();
    }
    @Test
    public void delete() throws SQLException{
        // 1.创建数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.执行修改操作
        int row = statement.executeUpdate("delete from student where id = 4");
        // 4.输出影响的行数
        System.out.println("删除" + row + "行的数据");
        // 5.释放资源
        statement.close();
        connection.close();
    }
}
