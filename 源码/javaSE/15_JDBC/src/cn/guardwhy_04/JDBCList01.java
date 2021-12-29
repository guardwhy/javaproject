package cn.guardwhy_04;

import cn.Enty.Student;
import cn.Utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCList01 {
    public static void main(String[] args) throws SQLException{
        // 1.创建stus集合对象
        List<Student> stus = new ArrayList<>();
        // 2.创建连接对象
        Connection connection = JdbcUtils.getConnection();
        // 3.得到预编译的语句对象
        PreparedStatement ps = connection.prepareStatement("select * from student");
        // 4.查询得到结果集
        ResultSet rs = ps.executeQuery();
        // 5.遍历结果集,将每条记录封装成一个Student对象
        while (rs.next()){
            Student stu = new Student();
            // 封装所有属性
            stu.setId(rs.getInt("id"));
            stu.setName(rs.getString("name"));
            stu.setSex(rs.getBoolean("sex"));
            stu.setBirthday(rs.getDate("birthday"));
            // 将stu添加到List中
            stus.add(stu);
        }
        // 6.释放资源
        JdbcUtils.close(connection, ps, rs);
        // 7.输出list集合
        stus.forEach(System.out::println);
    }
}
