package cn.guardwhy.demo02;

import cn.guardwhy.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo01 {
    public static void main(String[] args) throws SQLException {
        // 1.创建连接对象
        Connection con = JDBCUtils.getConnection();
        // 2.执行Sql语句执行对象
        Statement st = con.createStatement();
        // 3.插入数据
        st.executeUpdate("insert into jdbc_user values(null,'侯大力','xyxwer123','1992/12/26')");
        st.executeUpdate("insert into jdbc_user values(null,'张小欣','wazg456','1995/2/21')");

        // 4.获取预处理对象
        PreparedStatement pst = con.prepareStatement("insert into jdbc_user values(?,?,?,?)");
        // 5.插入数据
        pst.setString(1,null);
        pst.setString(2,"田甜");
        pst.setString(3,"tt134567");
        pst.setString(4,"1993/4/10");
        pst.executeUpdate();

        pst.setString(1,null);
        pst.setString(2,"杨帆");
        pst.setString(3,"yf223");
        pst.setString(4,"1991/5/1");
        pst.executeUpdate();

        // 6.释放资源
        st.close();
        pst.close();
        con.close();
    }
}
