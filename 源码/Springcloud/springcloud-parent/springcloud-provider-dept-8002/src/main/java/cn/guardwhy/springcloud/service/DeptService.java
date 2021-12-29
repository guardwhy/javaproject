package cn.guardwhy.springcloud.service;

import cn.guardwhy.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    // 1.添加一个部门
    boolean addDept(Dept dept);
    // 2.根据id查询部门
    Dept queryById(Long id);
    // 3.查询所有的部门
    List<Dept> queryAll();
}
