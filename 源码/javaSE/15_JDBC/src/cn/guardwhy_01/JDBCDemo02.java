package cn.guardwhy_01;
/**
 * 使用jdbc创建表,执行DDL语句
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo02 {
    public static void main(String[] args) {
        // 1.创建数据表
        String sql = "create table student ( id int primary key auto_increment, " +
                "name varchar(20) not null," +
                "sex boolean, " +
                "birthday date)";
        try {
            // 2.创建数据库连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "root");
            // 3.通过连接对象创建语句对象
            Statement statement = connection.createStatement();
            // 4.通过语句对象执行DDL
            statement.execute(sql);
            System.out.println("创建表成功...");
        } catch (SQLException e) {
            // 关闭语句和连接对象
            e.printStackTrace();
            System.out.println("创建数据表失败...");
        }
    }
}
