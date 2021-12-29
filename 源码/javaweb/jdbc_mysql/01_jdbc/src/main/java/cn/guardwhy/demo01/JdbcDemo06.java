package cn.guardwhy.demo01;
/**
 * JDBC:执行DML操作
 */
import cn.guardwhy.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo06 {

    @Test
    // 向学生表添加4条记录
    public void insert()throws SQLException {
        // 1.创建数据库连接对象
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象获得语句对象
        Statement statement = connection.createStatement();
        // 3.执行增删操作
        int row = statement.executeUpdate("insert into student (name,sex,birthday) values ('侯大利',1,'1999-2-10')," +
                "('田甜',1,'1999-5-10'),('杨红',1,'1999-2-10'),('张晓',1,'1999-2-10')");
        // 4.输出影响的行数
        System.out.println("添加了" + row + "行记录");

        // 5.关闭资源
        JDBCUtils.close(connection, statement);
    }

    @Test
    // 更新其中1条记录
    public void update() throws SQLException{
        // 1.创建数据库连接对象
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.执行修改操作
        int row = statement.executeUpdate("update student set name='宁玲', sex=0, birthday='1996-04-12'where id = 3");
        // 4.输出影响的行数
        System.out.println("更新了" + row + "行的数据");
        // 5.释放资源
        JDBCUtils.close(connection, statement);
    }

    @Test
    // 删除其中1条记录
    public void delete() throws SQLException{
        // 1.创建数据库连接对象
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.执行修改操作
        int row = statement.executeUpdate("delete from student where id = 4");
        // 4.输出影响的行数
        System.out.println("删除" + row + "行的数据");
        // 5.释放资源
        JDBCUtils.close(connection, statement);
    }
}