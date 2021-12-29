package cn.guardwhy;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

@SpringBootTest
class Springboot05DataApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        // 1.查看一下默认的数据源
        System.out.println(dataSource.getClass());
        // 2.获得数据库连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        // 3.获得连接
        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println("druidDataSource 数据源最大连接数:" + druidDataSource.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数:" + druidDataSource.getInitialSize());

        // 4.关闭
        connection.close();
    }

}
