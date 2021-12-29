package cn.guardwhy.dao;

import cn.guardwhy.pojo.User;
import cn.guardwhy.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    // 1.添加用户
    public int createUser(User user){
        // 2.创建连接对象
        Connection connection = null;
        // 3.创建预处理对象
        PreparedStatement preparedStatement = null;
        try {
            // 4.获得连接对象
            connection = DbUtil.getConnection();
            // 5.准备SQL语句
            String sql = "insert into t_user values(null, ?, ?)";
            // 6.获得预处理对象
            preparedStatement = connection.prepareStatement(sql);
            // 7.设置数据
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            // 8.执行SQL语句
            int row = preparedStatement.executeUpdate();
            // 9.执行成功
            return row;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 10.关闭资源
            try {
                DbUtil.closeConnection(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return 0; // 执行失败
    }
}
