package cn.guardwhy.dao.impl;

import cn.guardwhy.dao.UserDao;
import cn.guardwhy.pojo.User;
import cn.guardwhy.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
* userDao实现类
*/
public class UserDaoImpl implements UserDao {
    @Override
    public User userLogin(User user) {
        // 1.创建连接对象
        Connection connection = null;
        // 2.创建预处理对象
        PreparedStatement preparedStatement = null;
        // 3.创建结果集对象
        ResultSet resultSet = null;
        try {
            // 1.获取数据库连接
            connection = DbUtil.getConnection();
            // 2.准备sql语句
            String sql = "select * from t_user where userName = ? and password = ?";
            // 3.执行sql语句后获取结果并且返回
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            resultSet = preparedStatement.executeQuery();
            // 4条件判断
            if(resultSet.next()){
                User stu = new User(resultSet.getString("userName"), resultSet.getString("password"));
                // 4.1 查找成功
                return stu;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5.释放资源
            try {
                DbUtil.closeResource(connection, preparedStatement);
                if(null != resultSet){
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // 表示查找失败
        return null;
    }
}
