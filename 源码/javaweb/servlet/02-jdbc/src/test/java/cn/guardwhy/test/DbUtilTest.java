package cn.guardwhy.test;

import cn.guardwhy.util.DbUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class DbUtilTest {
    @Test
    public void demo1(){
        Connection connection = null;
        try {
            connection = DbUtil.getConnection();
            System.out.println("连接数据库成功...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
