package cn.guardwhy.test;

import cn.guardwhy.utils.DBCPUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
* 测试dbcp连接池
*/
public class TestDbcp {
    public static void main(String[] args) throws SQLException {
        // 1.从dbcp连接池中拿到连接对象
        Connection connection = DBCPUtils.getConnection();
        // 2. 获取statement对象
        Statement statement = connection.createStatement();
        // 3.查询所有员工的姓名
       String sql = "select ename from employee";
       ResultSet resultSet = statement.executeQuery(sql);

       // 4.处理结果集
        while (resultSet.next()){
            String ename = resultSet.getString("ename");
            System.out.println("员工姓名:" + ename);
        }
        // 5.释放资源
        DBCPUtils.close(connection, statement, resultSet);
    }
}
