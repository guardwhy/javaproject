package cn.guardwhy_01;
/**
 * 得到数据库连接对象
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCDemo01 {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test2";
        /**
         * 方式一:使用用户名、密码、url得到连接对象
         */
        Connection connection1 = DriverManager.getConnection(url, "root", "root");
        // 实现Connection接口的子类对象
        System.out.println("数据库连接对象:" + connection1);

        /**
         * 方式二:使用属性文件和url得到连接对象
         */
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root");
        // 2.实现connection接口
        Connection connection2 = DriverManager.getConnection(url, properties);
        System.out.println("数据库连接对象:" + connection2);
    }

}
