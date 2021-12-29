package cn.guardwhy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    // 注入jdbcTemplate
    @Autowired
    JdbcTemplate jdbcTemplate;
    // 1.查询数据中的所有信息,没有实体类数据库的数据通过Map获取
    @GetMapping("/userList")
    public List<Map<String, Object>> userList(){
        String sql = "select * from user";
        List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql);
        return list_maps;
    }

    // 2.添加数据
    @GetMapping("/addUser")
    public String addUser(){
        String sql = "insert into user (id, name, pwd) values(4, 'guardwhy', '123666')";
        jdbcTemplate.update(sql);
        return "update_ok";
    }

    // 3.通过id修改数据
    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
        String sql = "update user set name=?,pwd=? where id="+id;
        // 3.1 封装数据
        Object[] objects = new Object[2];
        objects[0] = "james";
        objects[1] = "mvp";
        jdbcTemplate.update(sql, objects);
        return "updateUser_ok";
    }

    // 4.通过id删除数据
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql, id);
        return "deleteUser_ok";
    }
}
