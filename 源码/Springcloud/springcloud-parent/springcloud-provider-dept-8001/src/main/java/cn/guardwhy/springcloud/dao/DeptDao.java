package cn.guardwhy.springcloud.dao;

import cn.guardwhy.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DeptDao {
    // 1.添加一个部门
    boolean addDept(Dept dept);
    // 2.根据id查询部门
    Dept queryById(Long id);
    // 3.查询所有的部门
    List<Dept> queryAll();
}
