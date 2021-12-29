package cn.guardwhy_03;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import cn.Utils.JdbcUtils;

public class TransactionDemo01 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.得到连接对象
            connection = JdbcUtils.getConnection();
            //2.得到语句对象
            statement = connection.createStatement();
            //3.执行更新操作2次，扣钱，加钱
            statement.executeUpdate("update account set balance = balance - 500 where name='Jack'");
            statement.executeUpdate("update account set balance = balance + 500 where name='Rose'");
            System.out.println("转账成功");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("转账失败");
        } finally {
            //4.释放资源
            JdbcUtils.close(connection, statement);
        }
    }

}
