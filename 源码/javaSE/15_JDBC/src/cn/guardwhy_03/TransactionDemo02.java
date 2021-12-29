package cn.guardwhy_03;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import cn.Utils.JdbcUtils;

public class TransactionDemo02 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.得到连接对象
            connection = JdbcUtils.getConnection();
            // 2.开启事务
            connection.setAutoCommit(false);
            //3.得到语句对象
            statement = connection.createStatement();
            //4.执行更新操作2次，扣钱，加钱
            statement.executeUpdate("update account set balance = balance - 500 where name='Jack'");
            // 模拟代码出现异常
            int i = 10 / 0;
            statement.executeUpdate("update account set balance = balance + 500 where name='Rose'");
            // 5.提交事务
            connection.commit();
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                // 回滚事务
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("转账失败");
        } finally {
            //4.释放资源
            JdbcUtils.close(connection, statement);
        }
    }

}
